package com.decorator;

public class CleanDecorator extends EmployeeDecorator {

	public CleanDecorator(Employee employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		super.work();
		clean();
	}
	
	//增加一个工作方法
	public void clean(){
		System.out.println(this.getName() + "开始打扫！");
	}
	

}
