package com.visitor;

/*
 * 商品
 */
public abstract class Goods {
	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 价格
	 */
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * 接受访问者
	 */
	public abstract void accept(IVisitor visitor);
	
}
