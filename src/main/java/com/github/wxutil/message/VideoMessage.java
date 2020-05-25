package com.github.wxutil.message;


import com.github.wxutil.MessageType;
import com.github.wxutil.WxMessage;

public class VideoMessage implements WxMessage {

    //开发者微信号
    private String toUserName;
    //客户openid
    private String fromUserName;
    //消息创建时间
    private Long createTime;
    //消息类型
    private MessageType msgType = MessageType.video;
    //消息媒体id，可以调用临时素材接口拉取数据
    private String mediaId;
    //消息id
    private Long msgId;
    //视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
    private String thumbMediaId;

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

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
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
