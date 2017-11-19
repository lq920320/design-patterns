package com.templateMethod;
/*
 * 水果面包
 */
public class FruitBread extends Bread {

	/**
	 * 构造方法
	 */
	public FruitBread() {
		super();
		this.setName("水果面包");
	}
	
	@Override
	public void prepare() {
		/**
		 * 材料准备
		 */
		System.out.println("准备水果");
	}

	@Override
	public void handle() {
		/**
		 * 处理材料
		 */
		System.out.println("加入水果");
	}

	@Override
	public void bake() {
		/**
		 * 烘焙
		 */
		System.out.println("低温烘焙");
	}

}
