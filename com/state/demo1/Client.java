package com.state.demo1;
/*
 * 商店状态
 */
public class Client {

	public static void main(String[] args) {
		Shop shop = new Shop("总店", "close");
		shop.checkState();
		shop.ready();
		shop.checkState();
		shop.open();
		shop.checkState();
		shop.close();
		shop.checkState();
		
		/**
		 * 以下代码违反了约定，所以出错了
		 */
		shop.open();
		shop.checkState();
		
	}

}
