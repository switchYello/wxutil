package com.github.wxutil.message;


import com.github.wxutil.MessageType;
import com.github.wxutil.WxMessage;

public class LocationMessage implements WxMessage {

    private static final long serialVersionUID = -3793026843174698082L;
    //开发者微信号
    private String toUserName;
    //客户openid
    private String fromUserName;
    //消息创建时间
    private Long createTime;
    //消息类型
    private MessageType msgType = MessageType.location;
    //地理位置x
    private String location_X;
    //地理位置y
    private String location_Y;
    //缩放
    private String scale;
    //地理位置信息
    private String label;
    //消息id
    private Long msgId;

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

    @Override
    public MessageType getMsgType() {
        return msgType;
    }


    public String getLocation_X() {
        return location_X;
    }

    public void setLocation_X(String location_X) {
        this.location_X = location_X;
    }

    public String getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(String location_Y) {
        this.location_Y = location_Y;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }


}
