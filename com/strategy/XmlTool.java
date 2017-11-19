package com.strategy;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * XML文件操作工具类
 */
public class XmlTool {

	/**
	 * 配置文件路径
	 */
	private String xmlpath = "/com/strategy/OffStrategy.xml";

	/**
	 * dom文档模型
	 */
	private Document document;

	/**
	 * 采用Initialization on Demand Holder idiom 构造单例类
	 */
	static class SingletonHolder {
		static XmlTool instance = new XmlTool();
	}

	public static XmlTool getInstance() {
		return SingletonHolder.instance;
	}

	/**
	 * 私有构造方法
	 */
	private XmlTool() {
		try {
			/**
			 * 解析XML文件
			 */
			DocumentBuilder documentBuilder = DocumentBuilderFactory
					.newInstance().newDocumentBuilder();
			document = documentBuilder.parse(this.getClass()
					.getResourceAsStream(xmlpath));
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String findStrategyClass(String key) {
		if (document == null) {
			return null;
		}

		try {
			/**
			 * 使用Xpath查找节点
			 */
			XPathFactory xPathFactory = XPathFactory.newInstance();
			XPath xPath = xPathFactory.newXPath();

			/**
			 * 构建一个XPath表达式
			 */
			XPathExpression expression = xPath
					.compile("/strategies/strategy[@type='" + key + "']");
			// 根据XPathExpression对象查找对应的节点集合
			NodeList nodes = (NodeList) expression.evaluate(document,
					XPathConstants.NODESET);
			if (nodes != null) {
				// 遍历节点集合
				// 判断如果并未找出人格节点返回null
				if (nodes.getLength() <= 0) {
					return null;
				}
				Node node = nodes.item(0);
				NamedNodeMap map = node.getAttributes();
				// 返回属性值
				return map.getNamedItem("class").getNodeValue();
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (DOMException e) {
			e.printStackTrace();
		}
		return null;
	}

}
