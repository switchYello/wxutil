package com.github.wxutil;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class XmlUtils {

    private static DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();

    private XmlUtils() {

    }

    /*beanUtils 自定义类型转换*/
    static {
        df.setValidating(false);
        df.setIgnoringElementContentWhitespace(true);
    }

    public static Map<String, String> parseWxMessageXml(String xml) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = df.newDocumentBuilder();
        Document parse = documentBuilder.parse(new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)));
        Element xmlElement = parse.getDocumentElement();
        NodeList childNodes = xmlElement.getChildNodes();
        int length = childNodes.getLength();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == Node.ELEMENT_NODE) {
                map.put(lowCase(item.getNodeName()), item.getFirstChild().getNodeValue());
            }
        }
        return map;
    }


    private static String lowCase(String src) {
        return lowCase(src, 1);
    }

    private static String lowCase(String src, int count) {
        if (src == null) {
            return null;
        }
        if (count == 0) {
            return src;
        }
        if (src.length() <= count) {
            return src.toLowerCase();
        }
        return src.substring(0, count).toLowerCase().concat(src.substring(count));
    }


}
