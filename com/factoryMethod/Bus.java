package com.factoryMethod;

public class Bus extends Auto {

	/**
	 * 构造方法
	 */
	public Bus() {
		this.setName("巴士");
	}

	@Override
	public void run() {
		System.out.println("启动" + this.getName());
	}

}
