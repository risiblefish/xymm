package fansoffan.xymm.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Sean Yu
 */
@Root
public class DiyMenuBean {
    /**
     * <xml>
     *   <ToUserName><![CDATA[toUser]]></ToUserName>
     *   <FromUserName><![CDATA[FromUser]]></FromUserName>
     *   <CreateTime>123456789</CreateTime>
     *   <MsgType><![CDATA[event]]></MsgType>
     *   <Event><![CDATA[CLICK]]></Event>
     *   <EventKey><![CDATA[EVENTKEY]]></EventKey>
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

    @Element(name = "Event")
    private String event;

    @Element(name = "EventKey")
    private String eventKey;

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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    @Override
    public String toString() {
        return "DiyMenuBean{" +
                "toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", msgType='" + msgType + '\'' +
                ", event='" + event + '\'' +
                ", eventKey='" + eventKey + '\'' +
                '}';
    }
}
