package com.memento.demo1;

public class Client {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.show();
		shop.setMoney(222);
		shop.show();
		shop.setMoney(1000);
		shop.show();
		shop.restore();
		shop.show();
	}

}
