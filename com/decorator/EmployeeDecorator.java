package com.decorator;

/**
 * 雇员装饰抽象类
 * 
 * @author liuqian
 * 
 */
public abstract class EmployeeDecorator extends Employee {

	private Employee employee;

	// 装饰模式构造方法
	public EmployeeDecorator(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return employee.getName();
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		employee.work();
	}

}
