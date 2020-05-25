package com.github.wxutil;

import com.github.wxutil.exception.WeChatException;
import com.github.wxutil.message.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.EnumUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author xiaoming
 */

public enum MessageType {
    /*文本消息*/
    text {
        @Override
        public WxMessage getTemplate() {
            return new TextMessage();
        }
    },
    /*图片消息*/
    image {
        @Override
        public WxMessage getTemplate() {
            return new ImageMessage();
        }
    },
    /*语音消息*/
    voice {
        @Override
        public WxMessage getTemplate() {
            return new VoiceMessage();
        }
    },
    /*视频消息*/
    video {
        @Override
        public WxMessage getTemplate() {
            return new VideoMessage();
        }
    },
    /*段视频消息*/
    shortvideo {
        @Override
        public WxMessage getTemplate() {
            return new ShortvideoMessage();
        }
    },
    /*位置消息*/
    location {
        @Override
        public WxMessage getTemplate() {
            return new LocationMessage();
        }
    },
    /*事件消息*/
    event {
        @Override
        public WxMessage getTemplate() {
            return new EventMessage();
        }
    };

    public static WxMessage convertToMessage(String xml) throws IOException, SAXException, ParserConfigurationException, InvocationTargetException, IllegalAccessException {
        Map<String, String> stringStringMap = XmlUtils.parseWxMessageXml(xml);
        MessageType messageType = EnumUtils.getEnum(MessageType.class, stringStringMap.get("msgType"));
        if (messageType == null) {
            throw new WeChatException("无法确认微信回调消息类型:" + xml);
        }
        WxMessage template = messageType.getTemplate();
        BeanUtils.populate(template, stringStringMap);
        return template;
    }


    public abstract WxMessage getTemplate();


}
