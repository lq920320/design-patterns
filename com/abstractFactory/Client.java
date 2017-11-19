package com.abstractFactory;

/**
 * 客户端代码
 * @author liuiqian
 *
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 创建一个需要常温保存的货物
		 */
		Goods goods = new Goods("餐具", GoodsType.normalTemperature);
		/**
		 * 获得合适的工厂
		 */
		Factory factory = AbstractFactoryHelper.getFactory(goods);
		/**
		 * 生产对象并操作
		 */
		AirConditioner airConditioner = factory.createAirConditioner();
		airConditioner.turnOn();
		
		Shelf shelf = factory.createShelf();
		shelf.put(goods);
		System.out.println();
		/**
		 * 创建一个需要冷冻的货物
		 */
		Goods goods1 =  new Goods("冰淇淋", GoodsType.coldTemperature);
		
		/**
		 * 获得合适的工厂
		 */
		Factory factory1 = AbstractFactoryHelper.getFactory(goods1);
		/**
		 * 生产对象并操作
		 */
		AirConditioner airConditioner1 = factory1.createAirConditioner();
		airConditioner1.turnOn();
		
		Shelf shelf1 = factory1.createShelf();
		shelf1.put(goods);

	}

}
