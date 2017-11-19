package com.mediator2;

import java.util.Observable;
/**
 * 抽象的超市操作方法
 * @author liuqian
 *
 */
public abstract class AbstractMethod extends Observable{
	/**
	 * 操作的名称
	 */
	private String methodName;

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	/**
	 * 是否允许操作
	 */
	private boolean ready;

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
		System.out.println(methodName + " 是否允许执行？" + ready);
	}
	/**
	 * 是否工作
	 */
	private boolean work;

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
		/**
		 * 通知观察者已经改变
		 */
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * 工作方法
	 */
	public void action() {
		if (ready) {
			System.out.println("=============" + methodName + "================");
			/**
			 * 工作过程
			 */
			this.setWork(true);
			System.out.println(methodName + "............done!");
			this.setWork(false);
		} else {
			System.out.println("当前不允许" + methodName + "!");
		}
	}
	
	/**
	 * 构造方法
	 */
	public AbstractMethod() {
		/**
		 * 设置就绪
		 */
		ready = true;
		
		/**
		 * 设置未工作
		 */
		work = false;
	}
	
	
}
