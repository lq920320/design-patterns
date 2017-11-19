package com.abstractFactory;

/**
 * 抽象工厂抽象类
 * @author liuiqian
 *
 */
public abstract class Factory {
	/**
	 * 生产具体的货架对象
	 * @return 具体货架
	 */
	public abstract Shelf createShelf();
	
	/**
	 * 生产具体的空调对象
	 * @return 具体空调
	 */
	public abstract AirConditioner createAirConditioner();
}
