package com.decorator;

public class CosmeticsSalesEmployee extends Employee {

	//构造方法
	public CosmeticsSalesEmployee(String name){
		super(name);
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "开始销售化妆品。");
	}

}
