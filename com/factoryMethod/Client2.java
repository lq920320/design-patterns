package com.factoryMethod;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 *调用工厂方法创建不同对象
		 */
		/**
		 * 创建变量（使用抽象类描述，面向接口编程）
		 */
		Factory factory;
		Auto auto;
		
		/**
		 * 创建Car
		 */
		factory = new CarFactory();
		auto = factory.createAuto();
		auto.run();
		
		/**
		 * 创建Bus
		 */
		factory = new BusFactory();
		auto = factory.createAuto();
		auto.run();
		
		/**
		 * 创建Truck
		 */
		factory = new TruckFactory();
		auto = factory.createAuto();
		auto.run();
	}

}
