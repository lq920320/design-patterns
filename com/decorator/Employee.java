package com.decorator;

/**
 * 雇员抽象类
 * @author liuqian
 *
 */
public abstract class Employee {
	//雇员名字
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee() {
		super();
	}
	
	//抽象工作方法
	public abstract void work();
}
