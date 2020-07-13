package fansoffan.xymm.controller;

import fansoffan.xymm.bean.Partner;
import fansoffan.xymm.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yzx
 */

@RestController
@RequestMapping("/partner")
public class PartnerController {

    @Autowired
    PartnerService partnerService;

    @GetMapping("/children-count")
    public int getSubPartnerCount(HttpServletRequest request){
        String callbackCode = request.getParameter("code");
        String openId = partnerService.getOpenId(callbackCode);
        return partnerService.getSubPartnerCount(openId);
    }

    @PutMapping("/candidate")
    public void insertCandidate(@RequestBody Partner candidate){
        partnerService.saveCandidate(candidate);
    }
}
