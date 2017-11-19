package com.templateMethod;
/*
 * 抽象面包装饰类
 */
public abstract class AbstractBreadDecorator extends Bread {

	/**
	 * 聚合一个Bread对象
	 */
	private Bread bread;
	
	/**
	 * 构造方法
	 */
	public AbstractBreadDecorator(Bread bread) {
		super();
		this.bread = bread;
	}
	
	/**
	 * 委托这个模板方法
	 */
	@Override
	public void prepare() {
		bread.prepare();
	}

	@Override
	public void handle() {
		bread.handle();
	}

	@Override
	public void bake() {
		bread.bake();
	}

}
