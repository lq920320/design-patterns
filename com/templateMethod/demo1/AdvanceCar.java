package com.templateMethod.demo1;

/*
 * 豪华三厢车
 */
public class AdvanceCar extends AbstractCarCreator {

	/**
	 * 只需要实现具体零件 的制造方法，无法重写总体制造方法
	 */
	@Override
	public void makeFrame() {
		System.out.println("安装了三厢车车架");
	}

	@Override
	public void makeGearKnob() {
		System.out.println("安装了自动挡");
	}

	@Override
	public void makeTyre() {
		System.out.println("安装了加宽轮胎");
	}

}
