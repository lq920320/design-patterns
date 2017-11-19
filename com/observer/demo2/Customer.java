package com.observer.demo2;
/**
 * 顾客类
 * @author liuqian
 *
 */
public class Customer implements IObserver {

	@Override
	public void update(Subject subject, Object args) {
		System.out.println("Customer 获得了新消息 [" + args + "]");
	}

}
