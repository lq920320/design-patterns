package com.singleton;

/**
 * 
 * @author liuiqian
 *饿汉式单例模式
 */
public class Singleton {

	/**
	 * 私有的静态的自身类对象
	 */
	private static final Singleton singleton = new Singleton();
	
	/**
	 * 私有构造方法
	 */
	private Singleton() {
		
	}
	
	//共有的静态获得实例方法
	public static Singleton getInstance(){
		return singleton;
	}
	
	
}
