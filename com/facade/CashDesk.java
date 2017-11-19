package com.facade;

import java.util.Scanner;

/**
 * 收款
 * 
 * @author liuqian
 * 
 */
public class CashDesk {
	/**
	 * 工作方法
	 */
	public void work(Scanner scanner) {
		/**
		 * 收银员提示付款
		 */
		System.out.println("请付款");
		/**
		 * 顾客付款
		 */
		String money = scanner.nextLine();
		System.out.println("感谢您付款" + money + "元！");
	}
}
