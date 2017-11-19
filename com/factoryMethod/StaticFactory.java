package com.factoryMethod;

/**
 * 静态工厂
 * @author liuiqian
 *
 */
public class StaticFactory {

	/**
	 * 工厂方法
	 */
	public static Auto createAuto(int autoId){
		switch(autoId){
		case 1:
			return new Car();
		case 2:
			return new Bus();
		case 3:
			return new Truck();
		default:
			/**
			 * 如果没有此种车型，抛出异常
			 */
			throw new RuntimeException("没有这种车型");
				
		}
	}
}
