package com.memento.demo1;
/**
 * 具有保存状态的商品店
 * @author liuqian
 *
 */
public class Shop {
	/**
	 * 营业收入
	 */
	private float money;

	public float getMoney() {
		return money;
	}

	/**
	 * 当要设置新金额时，保存上一个金额
	 * @param money
	 */
	public void setMoney(float money) {
		save();
		this.money = money;
	}
	
	/**
	 * 保存前一个收入金额
	 */
	private float backupMoney;

	/**
	 * 保存方法
	 */
	private void save() {
		backupMoney = money;
		System.out.println(backupMoney + " 被保存");
	}
	
	/**
	 * 恢复方法
	 */
	public void restore(){
		money = backupMoney;
		System.out.println(backupMoney + " 被恢复");
	}
	
	/**
	 * 展示当前金额
	 */
	public void show() {
		System.out.println("当前金额：" + money);
	}
	
	
}
