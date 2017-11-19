package com.singleton;

/**
 * 共用账户，是唯一的
 * @author liuiqian
 *
 */
public class BankAccount {

	private String name = "模式连锁店账户";
	
	private double money = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	/**
	 * 将设置金额的方法设置为同步，防止出现多线程异常
	 * @param money
	 */
	public synchronized void setMoney(double money) {
		this.money = money;
	}
	
	
}
