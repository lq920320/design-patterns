package com.visitor;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 访问者模式
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 创建访问者对象
		 */
		PackVisitor v1 = new PackVisitor();
		CheckVisitor v2 = new CheckVisitor();
		
		/**
		 * 创建集合
		 */
		Collection<Goods> gCollection = new ArrayList<>();
		
		/**
		 * 加入两个普通对象
		 */
		Goods a = new FoodGoods("凉粉", 5.3f);
		Goods b = new ToyGoods("魔方", 35.9f);
		gCollection.add(a);
		gCollection.add(b);
		
		/**
		 * 加入组合对象，cga，结构如下所示
		 * cgb = (a,b)
		 * cga = (a,b,cgb)
		 */
		CollectionGoods cga = new CollectionGoods();
		
		CollectionGoods cgb = new CollectionGoods();
		cgb.getGoodsCollection().add(a);
		cgb.getGoodsCollection().add(b);
		
		cga.getGoodsCollection().add(a);
		cga.getGoodsCollection().add(b);
		cga.getGoodsCollection().add(cgb);
		
		/**
		 * 访问
		 */
		System.out.println("访问包装功能");
		a.accept(v1);
		b.accept(v1);
		cga.accept(v1);
		
		System.out.println("访问计费功能");
		a.accept(v2);
		b.accept(v2);
		cga.accept(v2);
		System.out.println("金额打折后合计： \t" + v2.getCountMoney());
	}

}
