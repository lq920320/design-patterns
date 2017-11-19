package com.builderFactory1;

/**
 * 产品类
 * @author liuiqian
 *
 */
/**
 * @author liuiqian
 * 
 */
public class Product {
	/**
	 * 产品名称
	 */
	private String name;

	/**
	 * 产品价格
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
	 * 
	 * @param name
	 * @param price
	 */
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.getName() + "/$" + this.getPrice() + ")";
	}
}
