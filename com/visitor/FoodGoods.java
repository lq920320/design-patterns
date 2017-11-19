package com.visitor;
/*
 * 食物商品
 */
public class FoodGoods extends Goods{

	/**
	 * 构造方法
	 */
	public FoodGoods(String name, float price){
		this.setName(name);
		this.setPrice(price);
	}

	/**
	 * 接受访问者方法
	 */
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
