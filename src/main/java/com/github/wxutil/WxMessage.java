package com.github.wxutil;

import java.io.Serializable;


/*
* 微信消息接口
* */
public interface WxMessage extends Serializable {

    /*接收者*/
    String getToUserName();

    /*发送者*/
    String getFromUserName();

    /*创建时间*/
    Long getCreateTime();

    /*消息类型（枚举）*/
    MessageType getMsgType();

}
