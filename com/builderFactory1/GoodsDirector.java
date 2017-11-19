package com.builderFactory1;

import java.util.List;

/**
 * 抽象导演类
 * @author liuiqian
 *
 */
public abstract class GoodsDirector {

	/**
	 * 聚合创建对象
	 */
	private GoodsBuilder goodsBuilder;

	public GoodsBuilder getGoodsBuilder() {
		return goodsBuilder;
	}

	public void setGoodsBuilder(GoodsBuilder goodsBuilder) {
		this.goodsBuilder = goodsBuilder;
	}

	public GoodsDirector(GoodsBuilder goodsBuilder) {
		super();
		this.goodsBuilder = goodsBuilder;
	}
	
	/**
	 * 构建产品
	 */
	public abstract List<Product> construct();
	
}
