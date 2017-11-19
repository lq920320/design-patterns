package com.state.demo2;

/*
 * 客户端
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 构建环境对象
		 */
		Shop shop = new Shop();
		shop.check(100);
		
		shop.setDiscountState(HalfDiscountState.getInstance());
		shop.check(100);
	}

}
