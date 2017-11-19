package com.factoryMethod;

/**
 * 轿车
 * @author liuqian
 *
 */
public class Car extends Auto{
	/**
	 * 构造方法
	 */
	public Car(){
		this.setName("轿车");
	}

	/**
	 * 重写方法
	 */
	@Override
	public void run() {
		System.out.println("启动" + this.getName());
	}
}
