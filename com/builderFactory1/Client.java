package com.builderFactory1;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 导演对象
		 */
		GoodsDirector director;
		
		/**
		 * 标准TV
		 */
		director = new GoodsDirectorImplCommon(new GoodsBuilderImplTV());
		System.out.println("标准版TV");
		Client.viewList(director.construct());
		/**
		 * 标准版PSP
		 */
		director = new GoodsDirectorImplCommon(new GoodsBuilderImplPSP());
		System.out.println("标准版PSP");
		Client.viewList(director.construct());
		/**
		 * 豪华版TV
		 */
		director = new GoodsDirectorImplCostly(new GoodsBuilderImplTV());
		System.out.println("豪华版TV");
		Client.viewList(director.construct());
		/**
		 * 豪华版PSP
		 */
		director = new GoodsDirectorImplCostly(new GoodsBuilderImplPSP());
		System.out.println("豪华版PSP");
		Client.viewList(director.construct());
	}

	private static void viewList(List<Product> list) {
		// TODO Auto-generated method stub
		for (Object object : list){
			System.out.print(object + "  ");
		}
		System.out.println();
	}

}
