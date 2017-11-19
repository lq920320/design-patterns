package com.builderFactory;

import java.util.List;

public class DirectorImpl extends Director {

	/**
	 * 构造方法
	 * @param builder
	 */
	public DirectorImpl(Builder builder) {
		super(builder);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 重写父类的方法
	 */
	@Override
	public List construct() {
		// TODO Auto-generated method stub
		getBuilder().init();
		
		/**
		 * 创建过程
		 */
		getBuilder().createFoodA();
		getBuilder().createFoodB();
		getBuilder().createDrink();
		getBuilder().createAddition();
		
		/**
		 * 得到产品
		 */
		return getBuilder().getProductList();
	}

}
