package com.facade;

import java.util.Scanner;

/**
 * 购物助手
 * @author liuqian
 *
 */
public class ConsumerHelper {

	/**
	 * 销售人员
	 */
	private Saler saler = new Saler();
	
	/**
	 * 收银员
	 */
	private CashDesk cashDesk = new CashDesk();
	
	/**
	 * 注册员
	 */
	private Register register = new Register();
	
	/**
	 * 送货员
	 */
	private Deliverer deliverer = new Deliverer();
	
	/**
	 * 帮助方法
	 */
	public void help() {
		System.out.println("购物助手说：开始购物！");
		/**
		 * 客户端输入的扫描器
		 */
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * 引导顾客去购物
		 */
		saler.work(scanner);
		/**
		 * 引导顾客去付款
		 */
		cashDesk.work(scanner);
		/**
		 * 引导顾客去登记
		 */
		register.work(scanner);
		/**
		 * 引导顾客安排送货
		 */
		deliverer.work(scanner);
		System.out.println("导购助手说：购物结束！");
	}
}
