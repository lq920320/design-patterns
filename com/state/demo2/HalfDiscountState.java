package com.state.demo2;

/*
 * 半价
 */
public class HalfDiscountState implements IDiscountState {

	/**
	 * 折扣
	 */
	private float discount = 0.5f;

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	@Override
	public float getDiscount() {
		return discount;
	}

	/**
	 * 状态描述
	 */
	private String msg = "半价";

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
		static HalfDiscountState instance = 
				new HalfDiscountState();
	}
	
	public static HalfDiscountState getInstance() {
		return SingletonHolder.instance;
	}
	
	private HalfDiscountState(){
		
	}

}
