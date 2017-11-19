package com.visitor;

/*
 * 结账访问者
 */
public class CheckVisitor implements IVisitor {

	/**
	 * 总金额
	 */
	private double countMoney = 0;
	
	public double getCountMoney() {
		return countMoney;
	}

	public void setCountMoney(double countMoney) {
		this.countMoney = countMoney;
	}

	@Override
	public void visit(FoodGoods g) {
		double d = g.getPrice() * 0.75;
		countMoney += d;
		System.out.println("☆ 食品7.5折：\t" + d);
	}

	@Override
	public void visit(ToyGoods g) {
		double d = g.getPrice() * 0.8;
		countMoney += d;
		System.out.println("☆ 玩具8折：\t" + d);
	}

	@Override
	public void visit(CollectionGoods g) {
		System.out.println("组合对象分拆计算");
	}

}
