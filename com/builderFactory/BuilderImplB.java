package com.builderFactory;

/**
 * 儿童套餐
 */
public class BuilderImplB extends Builder {

	/**
	 * 创建主食
	 */
	public void createFoodA() {
		getProductList().add("巨无霸汉堡");
	}
	
	/**
	 * 创建辅食
	 */
	public void createFoodB() {
		getProductList().add("大薯条");
	}
	
	/**
	 * 创建饮料
	 */
	public void createDrink() {
		getProductList().add("大杯可乐");
	}
	
	/**
	 * 创建附加物,没有附加物
	 */
}
