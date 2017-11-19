package com.chainofresponsibility2;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * XML配置责任链模式
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		String xmlUrl = "/com/chainofresponsibility2/cor.xml";
		// 解析XML文件
		DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document document = documentBuilder.parse(Client.class.getResourceAsStream(xmlUrl));
		
		NodeList nodeList = document.getElementsByTagName("handler");
		
		/**
		 * 创建链条顶点
		 */
		Sign top = null;
		/**
		 * 链条末端
		 */
		Sign last = null;
		/*
		 * 获取链中的类进行装配
		 */
		for(int i = 0; i < nodeList.getLength(); i++){
			Node item = nodeList.item(i);
			NamedNodeMap attributes = item.getAttributes();
			Node attr = attributes.getNamedItem("class");
			/**
			 * 装配
			 */
			if (top == null){
				/**
				 * 顶点
				 */
				top = last = (Sign)Class.forName(attr.getNodeValue()).newInstance();
				
			}else{
				/**
				 * 其他点
				 */
				Sign chain = (Sign) Class.forName(attr.getNodeValue()).newInstance();
				last.setNext(chain);
				last = chain;
			}
		}
		
		/**
		 * 操作签字
		 */
		Record record = new Record();
		top.sign(record);
		
		System.out.println("manager签字：" + record.isManagerSign());
		System.out.println("CEO签字：" + record.isCeoSign());
		System.out.println("CFO签字：" + record.isCfoSign());
	}

}
