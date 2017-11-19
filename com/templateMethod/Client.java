package com.templateMethod;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建一个最后打包的牛奶面包
		 */
		AbstractBreadDecorator breada = new PackDecorator(new MilkBread()) {
		};
		
		/**
		 * 制作
		 */
		breada.create();
		
		System.out.println();
		
		/**
		 * 创建一个最后直接吃的水果面包
		 */
		AbstractBreadDecorator breadb = new EatDecorator(new FruitBread()) {
		};
		
		/**
		 * 制作
		 */
		breadb.create();
	}

}
