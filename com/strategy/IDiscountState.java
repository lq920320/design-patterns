package com.strategy;
/**
 * 折扣状态接口
 * @author liuqian
 *
 */
public interface IDiscountState {
	/**
	 * 价格系数，如全价为1，半价为0.5
	 * @return
	 */
	float getDiscount();
	
	/**
	 * 文字描述
	 * @return
	 */
	String getMsg();
}
