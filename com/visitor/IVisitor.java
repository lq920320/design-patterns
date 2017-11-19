package com.visitor;

/*
 * 包装访问者
 */
public interface IVisitor {

	void visit(FoodGoods g);
	
	void visit(ToyGoods g);
	
	void visit(CollectionGoods g);
}
