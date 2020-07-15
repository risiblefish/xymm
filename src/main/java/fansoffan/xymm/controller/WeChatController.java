package fansoffan.xymm.controller;

import fansoffan.xymm.bean.DiyMenuBean;
import fansoffan.xymm.bean.AutoReplyTextMsg;
import fansoffan.xymm.bean.Partner;
import fansoffan.xymm.service.PartnerService;
import org.simpleframework.xml.core.Persister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author Sean Yu
 */

@RestController
public class WeChatController {

    @Autowired
    Persister persister;

    @Autowired
    PartnerService partnerService;

    @GetMapping("/")
    public String validateWechatServer(HttpServletRequest request) {
        String echoStr = request.getParameter("echostr");
        System.out.println(echoStr);
        return echoStr;
    }

    @PostMapping("/")
    public void handleMessage(HttpServletRequest request, HttpServletResponse response) throws Exception {
        DiyMenuBean inMsg = persister.read(DiyMenuBean.class, request.getInputStream());
        System.out.println(inMsg.toString());

        String toUser = inMsg.getFromUserName();
        String fromUser = inMsg.getToUserName();

        AutoReplyTextMsg replyMsg = new AutoReplyTextMsg();
        replyMsg.setFromUserName(fromUser);
        replyMsg.setToUserName(toUser);
        replyMsg.setContent("the number is : " + partnerService.getSubPartnerCount("test"));
        PrintWriter writer = response.getWriter();
        StringWriter out = new StringWriter();
        persister.write(replyMsg, out);
        System.out.println(out.toString());
        writer.print(out);
        writer.close();
        out.close();
    }
}
