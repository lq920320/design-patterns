package com.facade;

public class Client {
	public static void main(String[] args) {
		/**
		 * 找到购物助手进行购物
		 */
		ConsumerHelper helper = new ConsumerHelper();
		
		helper.help();
	}
}
