package com.observer.demo2;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建主题类
		 */
		NewsPublisher newsPublisher = new NewsPublisher();
		GoodsPublisher goodsPublisher = new GoodsPublisher();
		
		/**
		 * 初始化监听器
		 */
		IObserver observerA = new Customer();
		IObserver observerB = new TV();
		
		/**
		 * 注册监听器，注意两个注册的不同组合
		 */
		newsPublisher.addObserver(observerA);
		
		goodsPublisher.addObserver(observerA);
		goodsPublisher.addObserver(observerB);
		
		/**
		 * 改变主题内容
		 */
		newsPublisher.setNews("新闻： 新店开张！");
		goodsPublisher.setNews("商品： 新货上架！");
	}

}
