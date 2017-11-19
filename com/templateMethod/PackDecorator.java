package com.templateMethod;
/*
 * 打包面包的装饰方法
 */
public abstract class PackDecorator extends AbstractBreadDecorator {

	public PackDecorator(Bread bread) {
		super(bread);
	}
	
	/**
	 * 重写模板方法
	 */
	@Override
	public void create(){
		super.create();
		System.out.println("将面包包装起来");
	}
}
