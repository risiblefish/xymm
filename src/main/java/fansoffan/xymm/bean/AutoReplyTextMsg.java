package fansoffan.xymm.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Sean Yu
 */
@Root(name = "xml")
public class AutoReplyTextMsg {

    public AutoReplyTextMsg() {
        this.createTime = System.currentTimeMillis()+ "";
        this.msgType = "text";
    }

    /**
     * e.g.
     * <xml>
     *   <ToUserName><![CDATA[toUser]]></ToUserName>
     *   <FromUserName><![CDATA[fromUser]]></FromUserName>
     *   <CreateTime>12345678</CreateTime>
     *   <MsgType><![CDATA[text]]></MsgType>
     *   <Content><![CDATA[你好]]></Content>
     * </xml>
     */




    @Element(name = "ToUserName")
    private String toUserName;

    @Element(name = "FromUserName")
    private String fromUserName;

    @Element(name = "CreateTime")
    private String createTime;

    @Element(name = "MsgType")
    private String msgType;

    @Element(name = "Content")
    private String content;

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
