package com.templateMethod;

public abstract class EatDecorator extends AbstractBreadDecorator {

	public EatDecorator(Bread bread) {
		super(bread);
	}
	
	/**
	 * 重写模板方法
	 */
	@Override
	public void create(){
		super.create();
		System.out.println("将面包放于盘子中");
	}

}
