package com.github.wxutil.exception;

import com.github.wxutil.WxMessage;

/**
 * hcy 2020/5/25
 */
public class WxMessageHandlerNotFindException extends RuntimeException {

    private static final long serialVersionUID = -8060075938160332950L;

    public WxMessageHandlerNotFindException(WxMessage wxMessage) {
        super("没有找到 MessageHandler For : " + wxMessage.getMsgType());
    }

}
