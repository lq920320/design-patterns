package com.observer.demo2;
/*
 * 电视类
 */
public class TV implements IObserver {

	@Override
	public void update(Subject subject, Object args) {
		System.out.println("TV 获得了新消息  [" + args + "]");
	}

}
