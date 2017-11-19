package com.templateMethod;
/*
 * 牛奶面包
 */
public class MilkBread extends Bread {

	/**
	 * 构造方法
	 */
	public MilkBread() {
		super();
		this.setName("牛奶面包");
	}
	@Override
	public void prepare() {
		/**
		 * 材料准备
		 */
		System.out.println("准备牛奶");
	}

	@Override
	public void handle() {
		/**
		 * 处理材料
		 */
		System.out.println("面团加入牛奶后发酵");
	}

	@Override
	public void bake() {
		/**
		 * 烘焙
		 */
		System.out.println("高温烘焙");
	}

}
