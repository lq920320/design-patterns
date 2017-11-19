package com.facade;

import java.util.Scanner;

/**
 * 送货
 * 
 * @author liuqian
 * 
 */
public class Deliverer {
	/**
	 * 工作方法
	 */
	public void work(Scanner scanner) {
		/**
		 * 提示给出送货时间
		 */
		System.out.println("请给出送货时间");
		/**
		 * 顾客付款
		 */
		String date = scanner.nextLine();
		System.out.println("送货时间：" + date);
	}
}
