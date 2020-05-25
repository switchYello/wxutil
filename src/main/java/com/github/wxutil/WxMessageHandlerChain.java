package com.github.wxutil;

import com.github.wxutil.exception.WxMessageHandlerNotFindException;

import java.util.HashMap;
import java.util.Map;

public class WxMessageHandlerChain implements WxMessageHandler {

    private Map<Class<? extends WxMessage>, WxMessageHandler> handlers = new HashMap<>();

    public void addHandler(WxMessageHandler handler, Class<? extends WxMessage> clazz) {
        handlers.put(clazz, handler);
    }

    @Override
    public String handler(WxMessage message) {
        WxMessageHandler handler = handlers.get(message.getClass());
        if (handler != null) {
            return handler.handler(message);
        }
        throw new WxMessageHandlerNotFindException(message);
    }

}
