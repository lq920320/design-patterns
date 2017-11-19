package com.templateMethod.demo1;

/**
 * 客户端代码
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 创建普通汽车制造对象
		 */
		AbstractCarCreator car1 = new NormalCar();
		/**
		 * 制造
		 */
		car1.makeCar();
		
		System.out.println();
		
		/**
		 * 创建豪华汽车制造对象
		 */
		AbstractCarCreator car2 = new AdvanceCar();
		/**
		 * 制造
		 */
		car2.makeCar();

	}

}
