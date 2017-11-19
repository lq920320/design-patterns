package com.strategy;

/*
 * 商品类
 */
public class Goods {
	/**
	 * 商品的类型
	 */
	private GoodsType goodsType;

	/**
	 * 商品价格
	 */
	private float price;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 构造方法
	 */
	public Goods(GoodsType goodsType, float price, String name) {
		super();
		this.goodsType = goodsType;
		this.price = price;
		this.name = name;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
