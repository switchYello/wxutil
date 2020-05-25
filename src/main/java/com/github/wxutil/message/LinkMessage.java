package com.github.wxutil.message;


import com.github.wxutil.MessageType;
import com.github.wxutil.WxMessage;

public class LinkMessage implements WxMessage {


    private static final long serialVersionUID = 1182389864019925399L;
    //开发者微信号
    private String toUserName;
    //客户openid
    private String fromUserName;
    //消息创建时间
    private Long createTime;
    //消息类型
    private MessageType msgType = MessageType.text;
    //消息标题
    private String title;
    //消息描述
    private String description;
    //消息连接
    private String url;
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

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
