package com.iterator2;

public class Client {

	public static void main(String[] args) {
		// 创建集合
		CarImpl car = new CarImpl();
		/**
		 * 加入数据
		 */
		car.add(new Goods("电视机", 3200.99f));
		car.add(new Goods("矿泉水", 0.8f));
		car.add(new Goods("笔记本电脑", 5200f));
		car.add(new Goods("茶壶", 22.99f));
		car.add(new Goods("口香糖", 5.98f));
		
		/**
		 * 测试普通迭代器
		 */
		IIterator iterator = car.createIterator();
		System.out.println("=============普通迭代========");
		for(; !iterator.isDone(); iterator.next()){
			Goods g = iterator.currentItem();
			System.out.println(g.getName() + "\t\t" + g.getPrice());
			
		}
		
		/**
		 * 测试排序迭代器
		 */
		IIterator iterator2 = car.createSortIterator();
		System.out.println("=============排序迭代========");
		for(; !iterator2.isDone(); iterator2.next()){
			Goods g = iterator2.currentItem();
			System.out.println(g.getName() + "\t\t" + g.getPrice());
			
		}
		System.out.println();
	}

}
