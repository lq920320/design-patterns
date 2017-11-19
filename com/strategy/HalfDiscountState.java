package com.strategy;

public class HalfDiscountState implements IDiscountState {

	// 价格系数
		private float discount = 0.5f;

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
		private String msg = "半价";

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
			static HalfDiscountState instance = new HalfDiscountState();
		}

		public static HalfDiscountState getInstance() {
			return SingletonHolder.instance;
		}

		private HalfDiscountState() {
		}

}
