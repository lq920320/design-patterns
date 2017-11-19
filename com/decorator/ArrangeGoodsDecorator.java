package com.decorator;

public class ArrangeGoodsDecorator extends EmployeeDecorator {

	public ArrangeGoodsDecorator(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		//前提是工作前整理货物，所以需要放在这个位置
		arrange();
		super.work();
	}

	//增加一个工作方法
	private void arrange() {
		System.out.println(this.getName() + " 开始整理货架！");
	}
	
	

}
