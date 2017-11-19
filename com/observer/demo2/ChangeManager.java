package com.observer.demo2;

import java.util.Hashtable;
import java.util.Vector;

/**
 * 更改管理器（单例）
 * @author liuqian
 *
 */
public class ChangeManager {
	/**
	 * 单例属性
	 */
	private static final ChangeManager cm = new ChangeManager();
	
	/**
	 * 保存映射关系
	 */
	private static Hashtable<Subject, Vector<IObserver>> map = new Hashtable<>();
	
	/**
	 * 私有构造方法
	 */
	private ChangeManager() {
		
	}
	
	/**
	 * 单例获得方法
	 */
	public static ChangeManager getInstance() {
		return cm;
	}
	
	/**
	 * 注册监听器
	 * @param subject
	 * @param observer
	 */
	public synchronized void register(Subject subject, IObserver observer){
		Subject key = subject;
		Vector<IObserver> observers = null;
		
		/**
		 * 查看此对象是否已注册
		 */
		if (map.containsKey(key)){
			observers = map.get(key);
		}
		
		/**
		 * 查看此对象对应的监听器的列表是否存在
		 */
		if (observers == null) {
			observers = new Vector<IObserver>();
		}
		
		/**
		 * 查看监听器是否重复
		 */
		if (!observers.contains(observer)){
			observers.add(observer);
		}
		/**
		 * 更新映射关系
		 */
		map.put(key, observers);
	}
	
	/**
	 * 解除监听器注册
	 * @param subject
	 * @param observer
	 */
	public synchronized void unregister(Subject subject, IObserver observer){
		map.get(subject).remove(observer);
	}
	
	public synchronized void notifyBySubject(Subject subject, Object args){
		for (IObserver observer : map.get(subject)){
			observer.update(subject, args);
		}
	}
}
