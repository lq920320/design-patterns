package com.decorator;

public class WashGoodsDecorator extends EmployeeDecorator {

	public WashGoodsDecorator(Employee employee) {
		super(employee);
	}

	@Override
	public void work() {
		//前提是工作前清洗商品，所以要放在这个位置
		wash();
		super.work();
	}
	
	//增加一个工作方法
	public void wash(){
		System.out.println(this.getName() + " 开始清洗商品！");
	}
}
