package com.observer.demo2;
/*
 * 监听器接口
 */
public interface IObserver {

	/**
	 * 更新方法
	 * @param subject 主题对象
	 * @param args 更新参数
	 */
	void update(Subject subject, Object args);
}
