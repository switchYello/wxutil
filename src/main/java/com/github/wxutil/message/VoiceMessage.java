package com.github.wxutil.message;

import com.github.wxutil.MessageType;
import com.github.wxutil.WxMessage;

public class VoiceMessage implements WxMessage {

    private static final long serialVersionUID = 1187194907566511322L;
    //开发者微信号
    private String toUserName;
    //客户openid
    private String fromUserName;
    //消息创建时间
    private Long createTime;
    //消息类型
    private MessageType msgType = MessageType.voice;
    //消息媒体id，可以调用临时素材接口拉取数据
    private String mediaId;
    //消息id
    private Long msgId;
    //语音格式，如amr，speex等
    private String format;

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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

}
