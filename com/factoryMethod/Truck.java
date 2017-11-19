package com.factoryMethod;

public class Truck extends Auto {

	/**
	 * 构造方法
	 */
	public Truck() {
		this.setName("卡车");
	}

	@Override
	public void run() {
		System.out.println("启动" + this.getName());
	}

}
