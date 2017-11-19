package com.state.demo2;
/*
 * 商品类
 */
public class Shop {
	/**
	 * 折扣状态类
	 */
	private IDiscountState discountState;

	public IDiscountState getDiscountState() {
		return discountState;
	}

	public void setDiscountState(IDiscountState discountState) {
		this.discountState = discountState;
	}
	
	/**
	 * 结账
	 * @param money
	 */
	public void check(float money) {
		System.out.println(discountState.getMsg());
		System.out.println("原价：" + money + "\t 现价："
				+ (money * (1 - discountState.getDiscount())));
	}
	
	/**
	 * 初始化方法
	 */
	public Shop() {
		this.setDiscountState(NormalDiscountState.getInstance());
	}
}
