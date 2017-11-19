package com.observer;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建主题类
		 */
		NewsPublisher newsPublisher = new NewsPublisher();
		
		/**
		 * 增加监听器
		 */
		newsPublisher.addObserver(new Customer());
		newsPublisher.addObserver(new TV());
		
		/**
		 * 改变主题内容
		 */
		newsPublisher.setNews("空调大降价");
	}

}
