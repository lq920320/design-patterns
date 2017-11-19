package com.mediator2;

import java.util.Observable;
import java.util.Observer;
/**
 * 调停者类
 *
 */
public class Mediator implements Observer {

	/**
	 * 聚合方法对象
	 */
	private Inventory inventory;
	private Purchase purchase;
	private Sell sell;
	
	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Sell getSell() {
		return sell;
	}

	public void setSell(Sell sell) {
		this.sell = sell;
	}
	/**
	 * 创建所有方法对象
	 */
	public void createMethods() {
		/**
		 * 创建
		 */
		inventory = new Inventory();
		purchase = new Purchase();
		sell = new Sell();
		
		/**
		 * 关联观察者对象
		 */
		inventory.addObserver(this);
		purchase.addObserver(this);
		sell.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// 转换为方法对象
		AbstractMethod abstractMethod = (AbstractMethod) o;
		/**
		 * 业务逻辑
		 */
		if(abstractMethod instanceof Sell) {
			//销售时：可以进货，不许盘点
			if(abstractMethod.isWork()){
				inventory.setReady(false);
			} else {
				inventory.setReady(true);
			}
		} else if (abstractMethod instanceof Purchase) {
			//进货时，可以销售，不许盘点
			if(abstractMethod.isWork()){
				inventory.setReady(false);
			} else {
				inventory.setReady(true);
			}
		} else if (abstractMethod instanceof Inventory) {
			//盘点时：不许销售，不许进货
			if (abstractMethod.isWork()) {
				sell.setReady(false);
				purchase.setReady(false);
			} else {
				sell.setReady(true);
				purchase.setReady(true);
			}
		}

	}

}
