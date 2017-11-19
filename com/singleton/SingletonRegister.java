package com.singleton;

import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 单例模式注册机
 * 客户需要通过此类获得所有单例对象
 * 此类本身使用“饿汉式”单例模式
 * @author liuiqian
 *
 */
public class SingletonRegister {

	/**
	 * 自身维护的单例模式类
	 */
	private static final SingletonRegister s = new SingletonRegister();
	
	/**
	 * 维护注册信息的Map
	 */
	private static final HashMap<String, Object> map = new HashMap<String, Object>();
	
	/**
	 * 处理多线程的可重入读写锁
	 */
	private static final ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
	
	/**
	 * 只读锁，此锁可以多个只读锁并存，锁定时不可以有可写锁
	 */
	private static Lock r = rwlock.readLock();
	
	/**
	 * 可写锁。此锁必须独占，锁定时不能有其他任何锁
	 */
	private static final Lock w = rwlock.writeLock();
	
	/**
	 * 私有构造方法
	 */
	private SingletonRegister(){
		
	}
	/**
	 * 用于取得某个类的单例对象
	 * @param classNmae
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static Object getInstance(String className)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Object c = null;
		/**
		 * 获得读取锁
		 */
		r.lock();
		try{
			System.out.println("读锁：" + Thread.currentThread().getName());
			c = map.get(className);
			if(c != null){
				return c;
			}
		} finally {
			/**
			 * 释放读取锁
			 */
			r.unlock();
		}
		/**
		 * 获得写锁
		 */
		w.lock();
		try{
			System.out.println("写锁：" + Thread.currentThread().getName());
			/**
			 * 双重检查
			 */
			c = map.get(className);
			if(c != null){
				System.out.println("直接使用已注册的对象："
						+ Thread.currentThread().getName());
				return c;
			}
			/**
			 * 使用反射的方法实例化对象
			 */
			c = Class.forName(className).newInstance();
			/**
			 * 放入注册表中
			 */
			map.put(className, c);
			System.out.println("新创建的对象："
					+ Thread.currentThread().getName());
		} finally {
			/**
			 * 释放写锁
			 */
			w.unlock();
		}
		return c;
	}
}
