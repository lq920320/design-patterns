package com.strategy;

/*
 * 不打折扣
 */
public class NormalDiscountState implements IDiscountState {

	// 价格系数
	private float discount = 1;

	@Override
	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	/**
	 * 状态描述
	 */
	private String msg = "没有折扣";

	@Override
	public String getMsg() {
		// TODO Auto-generated method stub
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 采用Initialization on Demand Holder idiom 构造单例类 内部静态类，单例持有者
	 */
	static class SingletonHolder {
		static NormalDiscountState instance = new NormalDiscountState();
	}

	public static NormalDiscountState getInstance() {
		return SingletonHolder.instance;
	}

	private NormalDiscountState() {
	}

}
