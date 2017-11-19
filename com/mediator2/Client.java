package com.mediator2;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建调停者
		 */
		Mediator mediator = new Mediator();
		
		/**
		 * 创建所有方法对象并关联观察者对象
		 */
		mediator.createMethods();
		
		/**
		 * 获得对象
		 */
		Inventory inventory = mediator.getInventory();
		Purchase purchase = mediator.getPurchase();
		Sell sell = mediator.getSell();
		
		/**
		 * 操作
		 */
		sell.action();
		purchase.action();
		inventory.action();
	}

}
