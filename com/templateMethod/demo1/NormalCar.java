package com.templateMethod.demo1;
/*
 * 普通两厢车
 */
public class NormalCar extends AbstractCarCreator {

	/**
	 * 只需要实现具体零件 的制造方法，无法重写总体制造方法
	 */
	@Override
	public void makeFrame() {
		System.out.println("安装了两厢车车架");
	}

	@Override
	public void makeGearKnob() {
		System.out.println("安装了手动挡");
	}

	@Override
	public void makeTyre() {
		System.out.println("安装了普通轮胎");
	}

}
