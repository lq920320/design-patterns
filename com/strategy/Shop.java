package com.strategy;

/*
 * 商店单例类
 * 计算折扣时先计算状态折扣，再计算商品类型折扣
 */
public class Shop {
	/**
	 * 聚合状态对象
	 */
	private IDiscountState discountState;

	/**
	 * 聚合策略对象
	 */
	private IStrategy strategy;

	public void setDiscountState(IDiscountState discountState) {
		this.discountState = discountState;
	}

	public IDiscountState getDiscountState() {
		return discountState;
	}

	/**
	 * 计算折扣后的金额
	 */
	public double check(Goods goods) {
		/**
		 * 计算状态折扣
		 */
		float money = goods.getPrice() * discountState.getDiscount();
		try {
			/**
			 * 计算策略折扣
			 */
			strategy = (IStrategy) Class.forName(
					XmlTool.getInstance().findStrategyClass(
							goods.getGoodsType().name())).newInstance();

			money *= strategy.getRate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(goods.getName() + "[" + goods.getGoodsType() + "]"
				+ " 原价：" + goods.getPrice() + " 全场折扣："
				+ discountState.getDiscount() + " 商品优惠：" + strategy.getRate()
				+ " 最终价格：" + money);
		
		return money;
	}
	
	/**
	 * 采用Initialization on Demand Holder idiom 构造单例类 内部静态类，单例持有者
	 */
	static class SingletonHolder {
		static Shop instance = new Shop();
	}

	public static Shop getInstance() {
		return SingletonHolder.instance;
	}

	private Shop() {
	}
}
