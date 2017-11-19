package com.strategy;

/**
 * 策略模式 + 状态模式
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 创建环境
		 */
		Shop shop = Shop.getInstance();
		
		/**
		 * 设置当前状态
		 */
		shop.setDiscountState(HalfDiscountState.getInstance());
		
		/**
		 * 创建几个商品
		 */
		Goods g1 = new Goods(GoodsType.服装,  55.8f, "牛仔裤");
		Goods g2 = new Goods(GoodsType.食品,  9.8f, "牛肉");
		Goods g3 = new Goods(GoodsType.无分类,  120.6f, "平底锅");
		
		/**
		 * 计算价格
		 */
		shop.check(g1);
		shop.check(g2);
		shop.check(g3);
		
		/**
		 * 改变状态
		 */
		shop.setDiscountState(HalfDiscountState.getInstance());
		/**
		 * 计算价格
		 */
		shop.check(g1);
		shop.check(g2);
		shop.check(g3);
	}

}
