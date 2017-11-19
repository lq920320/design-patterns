package com.visitor;
/*
 * 包装访问者
 */
public class PackVisitor implements IVisitor {

	@Override
	public void visit(FoodGoods g) {
		System.out.println("☆ 食品包装：" + g.getName());
	}

	@Override
	public void visit(ToyGoods g) {
		System.out.println("☆ 玩具包装：" + g.getName());
	}

	@Override
	public void visit(CollectionGoods g) {
		System.out.println("组合对象分拆包装");
	}

}
