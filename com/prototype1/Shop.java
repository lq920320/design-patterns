package com.prototype1;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Cloneable {

	/**
	 * 店铺名，作为ID
	 */
	private String name;

	/**
	 * 商品列表
	 */
	private List<Goods> goodLists = new ArrayList<Goods>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Goods> getGoodLists() {
		return goodLists;
	}

	public void setGoodLists(List<Goods> goodLists) {
		this.goodLists = goodLists;
	}

	/**
	 * 因为每一个店铺都有唯一的名称， 所以有必要用一个方法作为其克隆之后的设置方法
	 */
	public void init(String name) {
		this.setName(name);
	}

	public Object clone() {
		try {
			Shop shop = (Shop) super.clone();
			shop.setGoodLists(new ArrayList<Goods>());
			for (Goods g : goodLists) {
				shop.getGoodLists().add((Goods) g.clone());
			}
			return shop;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("name:[" + this.getName() + "]goods:[");
		for (Goods goods : getGoodLists()){
			sb.append(goods.getName() + "/" + goods.getPrice() + ",");
		}
		//判断最后一个字符是否是","，是就删除
		if (sb.charAt(sb.length() - 1) == ','){
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append("]");
		return sb.toString();
	}
}
