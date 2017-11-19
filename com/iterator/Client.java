package com.iterator;

public class Client {

	public static void main(String[] args) {
		// 创建集合
		Aggregate aggregate = new AggregateImpl();

		/**
		 * 创建迭代器
		 */
		Iterator iterator = aggregate.createIterator();

		/**
		 * 访问集合
		 */
		for (; !iterator.isDone(); iterator.next()) {
			System.out.println(iterator.currentItem());
		}
	}

}
