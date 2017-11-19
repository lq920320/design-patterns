package com.composite;

public class Person extends CompanyElement {

	@Override
	public void work() {
		System.out.println(this.toString() + " 工作了！ ");
	}
	
	//空参数构造方法
	public Person(){
		super();
	}
	
	//带参数构造方法
	public Person(CompanyElement parent,
			String name, String job, float salary){
		super(parent, name, job, salary);
	}

}
