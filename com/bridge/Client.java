package com.bridge;

public class Client {

	public static void main(String[] args) {
		// 在构建对象时使用桥接模式
		Log log = new UserLog(new XmlImpl());
		log.writeToLog();
		
		//在构建对象时使用桥接模式
		Log log2 = new DbLog(new EmailImpl());
		log2.writeToLog();

	}

}
