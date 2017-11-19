package com.templateMethod.demo1;

/*
 * 抽象模板类，汽车制造
 */
public abstract class AbstractCarCreator {

	/**
	 * 制作方法被设计为模板方法，子类无法修改
	 */
	public final void makeCar() {
		/**
		 * 列出无法修改的制造顺序
		 */
		makeFrame();
		makeGearKnob();
		makeTyre();
	}
	
	/**
	 * 抽象方法，制作车架
	 */
	abstract public void makeFrame();
	
	/**
	 * 抽象方法，制作档位配件
	 */
	abstract public void makeGearKnob();
	
	/**
	 * 抽象方法，制作轮胎
	 */
	abstract public void makeTyre();
}
