package com.decorator;
/**
 * 水果销售人员
 * @author liuqian
 *
 */
public class FruitSalesEmployee extends Employee {

	//构造方法
	public FruitSalesEmployee(String name){
		super(name);
	}
	//重写父类的抽象方法
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "开始销售水果");
		
	}

	
}
