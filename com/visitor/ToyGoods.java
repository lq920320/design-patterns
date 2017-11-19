package com.visitor;
/*
 * 玩具商品
 */
public class ToyGoods extends Goods {

	/**
	 * 构造方法
	 * @param name
	 * @param price
	 */
	public ToyGoods(String name, float price){
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
