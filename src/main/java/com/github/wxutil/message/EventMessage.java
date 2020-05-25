package com.github.wxutil.message;

import com.github.wxutil.MessageType;
import com.github.wxutil.WxMessage;

public class EventMessage implements WxMessage {

    private static final long serialVersionUID = -4855292788016959789L;

    //开发者微信号
    private String toUserName;
    //客户openid
    private String fromUserName;
    //消息创建时间
    private Long createTime;
    //消息类型
    private MessageType msgType = MessageType.event;

    private String event;

    private String eventKey;

    @Override
    public MessageType getMsgType() {
        return msgType;
    }

    @Override
    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    @Override
    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    @Override
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
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
        return "EventMessage{" +
                "toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime=" + createTime +
                ", msgType=" + msgType +
                ", event='" + event + '\'' +
                ", eventKey='" + eventKey + '\'' +
                '}';
    }
}
