package com.github.wxutil;

import com.github.wxutil.WxMessage;

public interface WxMessageHandler {

	String handler(WxMessage message);
	
}
