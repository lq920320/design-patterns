package com.observer.demo2;

import java.util.Vector;

/*
 * 被监听的主题
 */
public abstract class Subject {
	/**
	 * 保存一个更改管理器
	 */
	private static final ChangeManager changeManager = ChangeManager.getInstance();
	
	public static ChangeManager getChangeManager() {
		return changeManager;
	}
	
	/**
	 * 新增监听器
	 */
	public void addObserver(IObserver observer){
		getChangeManager().register(this, observer);
	}
	
	/**
	 * 移除监听器
	 */
	public synchronized void removeObservers(IObserver observer) {
		getChangeManager().unregister(this, observer);
	}
	
	/**
	 * 通知更新
	 */
	public void notify(Object args) {
		getChangeManager().notifyBySubject(this, args);
	}
	
}
