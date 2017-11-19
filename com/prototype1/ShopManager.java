package com.prototype1;

import java.util.Map;
import java.util.TreeMap;

/**
 * 商品的工具类
 * 
 * @author liuiqian
 * 
 */
public class ShopManager {
	/**
	 * 用于保存现有的店铺，用于查询和克隆
	 */
	private static Map<String, Shop> shopMap = new TreeMap<String, Shop>();

	/**
	 * 查找店铺
	 */
	public static Shop findShop(String name) {
		return shopMap.get(name);
	}

	/**
	 * 加入连锁店铺
	 */
	public static void addShop(Shop shop) {
		shopMap.put(shop.getName(), shop);
	}
	
	/**
	 * 删除店铺
	 */
	public static void removeShop(String name) {
		shopMap.remove(name);
	}
	
	/**
	 * 显示所有店铺信息
	 */
	public static void showAllShop() {
		for (Map.Entry<String, Shop> entry : shopMap.entrySet()) {
			System.out.println(entry.getValue());
		}
		System.out.println();
	}
}
