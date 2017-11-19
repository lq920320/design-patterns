package com.builderFactory1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象商品建造类
 * @author liuiqian
 *
 */
public abstract class GoodsBuilder {
	/**
	 * 商品的列表
	 */
	private List<Product> productList;

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	/**
	 * 初始化
	 */
	public void init() {
		productList = new ArrayList<Product>();
	}
	
	public void createMainProduct() {
		//空方法
	}
	
	public void createAdd1Product() {
		//空方法
	}
	
	public void createAdd2Product() {
		//空方法
	}
}
