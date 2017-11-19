package com.abstractFactory;

public class Goods {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 商品类别
	 */
	private GoodsType goodsType;
	
	public GoodsType getGoodsType() { 
		return this.goodsType;
	}
	
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	
	/**
	 * 构造方法
	 */
	public Goods(String name, GoodsType goodsType) {
		super();
		this.name = name;
		this.goodsType = goodsType;
	}
}
