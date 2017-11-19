package com.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		/**
		 * 创建处理对象
		 */
		Handler topHandler = new AddHandler();
		Handler mulHandler = new MulHandler();
		Handler divHandler = new DivHandler();
		
		/**
		 * 组装链条，结构如下
		 * +----------+   +-----------+    +------------+
		 * |topHandler +--->+ mulHandler +-->+ divHandler| 
		 * +----------+   +-----------+    +------------+
		 */
		mulHandler.setNextHandler(divHandler);
		topHandler.setNextHandler(mulHandler);
		
		/**
		 * 处理需求
		 */
		System.out.println("34*23=" + topHandler.handle(34, 23, "*"));
		System.out.println("34/23=" + topHandler.handle(34, 23, "/"));
	}
}
