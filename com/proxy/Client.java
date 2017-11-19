package com.proxy;
/**
 * 顾客
 * @author liuiqian
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====测试手机模型======");
		Saler saler = new Saler();
		Phone phone = saler.choosePhone("NOKIA", "N95", "红");
		phone.call();
		System.out.println("=====购买手机=====");
		phone = saler.buyPhone("APPLE", "iphone", "黑");
		phone.call();
		System.out.println("=====购买无货手机=====");
		phone = saler.buyPhone("APPLE", "iphone", "红");
	}

}
