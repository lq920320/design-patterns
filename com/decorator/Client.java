package com.decorator;

public class Client {

	public static void main(String[] args) {
		// 定义一个销售水果人员
		Employee fruitSaler = new FruitSalesEmployee("李逍遥");
		// 定义一个化妆品销售人员
		Employee cosmeticsSaler = new CosmeticsSalesEmployee("赵灵儿");

		System.out.println("log: 本职工作开始");
		fruitSaler.work();
		cosmeticsSaler.work();

		System.out.println("log: 装饰工作开始");
		// 使用装饰器
		// 根据不同的需要进行装饰器的组合
		fruitSaler = new CleanDecorator(new WashGoodsDecorator(
				new WashGoodsDecorator(fruitSaler)));
		fruitSaler.work();

		cosmeticsSaler = new ArrangeGoodsDecorator(new CleanDecorator(
				cosmeticsSaler));
		cosmeticsSaler.work();
	}

}
