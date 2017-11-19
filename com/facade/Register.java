package com.facade;

import java.util.Scanner;

/**
 * 登记
 * @author liuqian
 *
 */
public class Register {
	/**
	 * 工作方法
	 */
	public void work(Scanner scanner) {
		/**
		 * 提示登记
		 */
		System.out.println("请输入联系电话");
		/**
		 * 顾客付款
		 */
		String telCode = scanner.nextLine();
		System.out.println("已记录您的电话号码：" + telCode);
	}
}
