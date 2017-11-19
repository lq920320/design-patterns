package com.iterator2;
/**
 * 商品类
 * @author liuqian
 *
 */
public class Goods {
	/**
	 * 商品名称
	 */
	private String name;
	
	/**
	 * 商品价格
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
	 * 构造方法
	 * @param name
	 * @param price
	 */
	public Goods(String name, float price){
		super();
		this.name = name;
		this.price = price;
	}
}
