package com.state.demo2;

/*
 * 不参加折扣
 */
public class NormalDiscountState implements IDiscountState {

	/**
	 * 折扣
	 */
	private float discount = 0;
	
	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public float getDiscount() {
		return discount;
	}
	
	private String msg = "没有折扣";

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMsg() {
		return msg;
	}
	
	/**
	 * 采用 Initialization on Demand Holder idiom 构造单例类
	 * 内部静态类，单例持有者
	 *
	 */
	static class SingletonHolder {
		static NormalDiscountState instance = 
				new NormalDiscountState();
	}
	
	public static NormalDiscountState getInstance() {
		return SingletonHolder.instance;
	}
	
	private NormalDiscountState(){
		
	}

}
