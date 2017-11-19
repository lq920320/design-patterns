package com.proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * 具有采购和存储功能的仓库
 * @author liuiqian
 *
 */
public class Depot {
	/**
	 * 单例模式使用的自身实例
	 */
	private static Depot depot;
	
	/**
	 * 仓库当前储备
	 */
	private static Map<Phone, Integer> reserve;
	
	/**
	 * 单例模式获得仓库实例
	 */
	public static synchronized Depot getInstance() {
		if(depot == null){
			depot = new Depot();
		}
		return depot;
	}
	
	/**
	 * 单例模式需要私有的构造方法
	 */
	private Depot() {
		//构建储备库
		reserve = new HashMap<Phone, Integer>();
		//放一些测试数据
		reserve.put(new MobilePhone(
				"NOKIA","N95","红"), 3);
		reserve.put(new MobilePhone(
				"APPLE","iphone","黑"), 5);
	}
	
	/**
	 * 在仓库中取出手机，此方法注意要同步
	 */
	public synchronized static Phone getPhone(String brand, 
			String series, String color){
		Phone phone = new MobilePhone(brand, series, color);
		//查看是否存在着款手机
		if(reserve.containsKey(phone) && reserve.get(phone) > 0){
			//库存减一
			reserve.put(phone, reserve.get(phone) - 1);
			return phone;
		}
		return null;
	}
	
}
