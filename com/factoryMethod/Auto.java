package com.factoryMethod;

/**
 * 抽象汽车类
 * @author liuqian
 *
 */
public abstract class Auto {
	/**
	 * 车型名称
	 */
	private String name;
	
	/**
	 * 抽象工作方法
	 */
	abstract public void run();
	
	/**
	 * getter、setter
	 */
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
