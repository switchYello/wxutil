package com.github.wxutil;


import com.github.wxutil.WxMessage;

import java.text.MessageFormat;

public class ReturnMessageUtils {

	private static final String textMessage =
			"<xml>" +
					"<ToUserName><![CDATA[{0}]]></ToUserName>" +
					"<FromUserName><![CDATA[{1}]]></FromUserName>" +
					"<CreateTime>{2}</CreateTime>" +
					"<MsgType><![CDATA[text]]></MsgType>" +
					"<Content><![CDATA[{3}]]></Content>" +
					"</xml>";

	public static String textMessage(String to, String from, String content) {
		return MessageFormat.format(textMessage, to, from, System.currentTimeMillis() / 1000, content);
	}

	public static String textMessage(WxMessage message, String content) {
		return textMessage(message.getFromUserName(), message.getToUserName(), content);
	}

	private static final String imageMessage = "" +
			"<xml>" +
			"<ToUserName><![CDATA[{0}]]></ToUserName>" +
			"<FromUserName><![CDATA[{1}]]></FromUserName>" +
			"<CreateTime>{2}</CreateTime>" +
			"<MsgType><![CDATA[image]]></MsgType>" +
			"<Image>" +
			"<MediaId><![CDATA[{3}]]></MediaId>" +
			"</Image>" +
			"</xml>";

	public static String imageMessage(String to, String from, String mediaId) {
		return MessageFormat.format(imageMessage, to, from, System.currentTimeMillis() / 1000, mediaId);
	}

	public static String imageMessage(WxMessage message, String mediaId) {
		return imageMessage(message.getFromUserName(), message.getToUserName(), mediaId);
	}

	/*回复图文消息*/
	private static String newsMessage = "<xml>" +
			"  <ToUserName><![CDATA[{0}]]></ToUserName>" +
			"  <FromUserName><![CDATA[{1}]]></FromUserName>" +
			"  <CreateTime>{2}</CreateTime>" +
			"  <MsgType><![CDATA[news]]></MsgType>" +
			"  <ArticleCount>1</ArticleCount>" +
			"  <Articles>" +
			"    <item>" +
			"      <Title><![CDATA[{3}]]></Title>" +
			"      <Description><![CDATA[{4}]]></Description>" +
			"      <PicUrl><![CDATA[{5}]]></PicUrl>" +
			"      <Url><![CDATA[{6}]]></Url>" +
			"    </item>" +
			"  </Articles>" +
			"</xml>";

	public static String newsMessage(String to, String from, String title, String description, String picUrl, String url) {
		return MessageFormat.format(newsMessage,
				to,
				from,
				System.currentTimeMillis() / 1000,
				title,
				description,
				picUrl,
				url
		);
	}

	public static String newsMessage(WxMessage message, String title, String description, String picUrl, String url) {
		return newsMessage(message.getFromUserName(), message.getToUserName(),
				title,
				description,
				picUrl,
				url);
	}


}
