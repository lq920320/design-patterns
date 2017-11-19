package com.builderFactory;

/**
 * 儿童套餐
 */
public class BuilderImplA extends Builder {

	/**
	 * 创建主食
	 */
	public void createFoodA() {
		getProductList().add("麦香鱼汉堡");
	}
	
	/**
	 * 创建辅食
	 */
	public void createFoodB() {
		getProductList().add("小薯条");
	}
	
	/**
	 * 创建饮料
	 */
	public void createDrink() {
		getProductList().add("奶昔");
	}
	
	/**
	 * 创建附加物
	 */
	public void createAddition() {
		getProductList().add("喜洋洋玩具");
	}
}
