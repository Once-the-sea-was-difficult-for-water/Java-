package com.lw.随笔1.xml可扩展标记语言.java手写服务器.test1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/*
*  SAX，全称Simple API for XML，是一种以事件驱动的XMl API，是XML解析的一种新的替代方法，
* 解析XML常用的还有DOM解析，PULL解析（Android特有），SAX与DOM不同的是它边扫描边解析，自顶向下依次解析，
* 由于边扫描边解析，所以它解析XML具有速度快，占用内存少的优点，对于Android等CPU资源宝贵的移动平台来说是一个巨大的优势。
* */
public class Test1{
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //sax解析
        //1、获取解析工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //2、从解析工厂获取解析器
        SAXParser parser = factory.newSAXParser();
        //3、编写处理器
        //4、加载文档Document注册处理器
        PHandler pHandler = new PHandler();
        //5、解析
        parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/lw/p.xml"),pHandler);
    }

}
class PHandler extends DefaultHandler{
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("解析xml结束");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        System.out.println(qName+"解析开始");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String content =  new String(ch,start,length).trim();
        if (!content.equals(null)){
            System.out.println("内容为"+content);
        }else {
            System.out.println("内容为空空");
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println(qName+"解析结束");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("解析xml结束");
    }
}
