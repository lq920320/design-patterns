package com.builderFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Builder {

	/**
	 * 商品的列表
	 */
	private List productList;

	public List getProductList() {
		return this.productList;
	}
	
	public void setProductList(List productList) {
		this.productList = productList;
	}
	
	/**
	 * 初始化，生成新的产品列表
	 */
	public void init() {
		this.productList = new ArrayList();
	}
	
	/**
	 * 以下方法为创建商品的方法
	 * 注意此处不声明为抽象方法的好处是：
	 * 如果是具体子类没有某个创建方法，则会自动调用父类的空方法
	 * 而抽象方法则强制子类实现，造成编程上的冗余
	 */
	public void createFoodA() {
		
	}
	
	public void createFoodB() {
		
	}
	
	public void createDrink() {
		
	}
	
	public void createAddition() {
		
	}
	
}
