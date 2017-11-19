package com.templateMethod;

/*
 * 抽象面包类
 */
public abstract class Bread {
	/**
	 * 面包名称
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 模板方法：面包制作
	 * 没有定义成final方法以便被装饰模式使用
	 */
	public void create() {
		prepare();
		handle();
		bake();
	}
	
	/**
	 * 抽象方法：准备
	 */
	abstract public void prepare();
	
	/**
	 * 抽象方法：处理材料
	 */
	abstract public void handle();
	
	/**
	 * 抽象方法：烘焙
	 */
	abstract public void bake();
}
