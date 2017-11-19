package com.facade;

import java.util.Scanner;

/**
 * 导购
 * 
 * @author liuqian
 * 
 */
public class Saler {
	/**
	 * 工作方法
	 */
	public void work(Scanner scanner) {
		/**
		 * 售货员给出选择
		 */
		System.out.println("请输入要买的商品编号：");
		System.out.println("1.电视       2.冰箱      3.洗衣机         4.空调");
		/**
		 * 顾客购买
		 */
		String buyCode = scanner.nextLine();
		System.out.println("谢谢您购买" + buyCode + "号商品！");
	}
}
