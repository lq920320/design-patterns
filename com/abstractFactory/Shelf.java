package com.abstractFactory;

/**
 * 货架抽象类
 * 
 * @author liuiqian
 * 
 */
public abstract class Shelf {
	/**
	 * 货架名称
	 */
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 存放货物方法
	 */
	public void put(Goods goods) {
		System.out.println(goods.getName() + "放入" + getName());
	}
}
