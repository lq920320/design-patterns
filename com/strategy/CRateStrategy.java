package com.strategy;

/*
 * 5折策略
 */
public class CRateStrategy implements IStrategy {

	/**
	 * 获得折扣比例
	 */
	@Override
	public float getRate() {
		// TODO Auto-generated method stub
		return 0.5f;
	}

}
