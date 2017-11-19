package com.builderFactory;

import java.util.List;

/**
 * 客户端
 * @author liuiqian
 *
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 声明一个导演变量
		 */
		Director director;
		
		/**
		 * 构建儿童套餐的过程
		 * 创建导演，传入特定的建造对象
		 */
		director = new DirectorImpl(new BuilderImplA());
		/**
		 * 建造
		 */
		List aList = director.construct();
		/**
		 * 显示结果
		 */
		Client.viewList(aList);
		
		/**
		 * 构建成人套餐的过程
		 * 创建导演，传入特定的建造对象
		 */
		director = new DirectorImpl(new BuilderImplB());
		/**
		 * 建造
		 */
		List bList = director.construct();
		/**
		 * 显示结果
		 */
		Client.viewList(bList);
		
	}

	/**
	 * 打印列表信息的工具方法
	 * @param aList
	 */
	private static void viewList(List list) {
		// TODO Auto-generated method stub
		for (Object object : list){
			System.out.print(object + "  ");
		}
		System.out.println();
	}

}
