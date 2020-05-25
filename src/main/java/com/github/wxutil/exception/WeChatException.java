package com.github.wxutil.exception;

public class WeChatException extends RuntimeException {
	private static final long serialVersionUID = -681529791819386003L;

	public WeChatException() {
	}

	public WeChatException(String message) {
		super(message);
	}

	public WeChatException(String message, Throwable cause) {
		super(message, cause);
	}

	public WeChatException(Throwable cause) {
		super(cause);
	}

	public WeChatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
