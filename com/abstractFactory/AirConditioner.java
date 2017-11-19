package com.abstractFactory;

/**
 * 空调抽象类
 * 
 * @author liuiqian
 * 
 */
public abstract class AirConditioner {

	/**
	 * 空调名称
	 */
	private String name;

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 空调启动
	 */
	public void turnOn() {
		System.out.println(getName() + "");
	}
}
