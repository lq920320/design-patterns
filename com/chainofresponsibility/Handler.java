package com.chainofresponsibility;
/*
 * 责任链模式抽象类
 */
public abstract class Handler {
	/**
	 * 存放链条的下一个节点对象
	 */
	private Handler nextHandler;

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	/**
	 * 默认的处理需求的方法
	 */
	public Object handle(double num1, double num2, String calaulateType){
		if(nextHandler == null){
			return null;
		} else {
			return nextHandler.handle(num1, num2, calaulateType);
		}
	}
}
