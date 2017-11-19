package com.factoryMethod;

public class CarFactory extends Factory {

	/**
	 * 重写父类方法
	 */
	@Override
	public Auto createAuto() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
