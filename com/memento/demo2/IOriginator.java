package com.memento.demo2;

/*
 * 原发器接口
 */
public interface IOriginator {
	/**
	 * 创建备忘录对象
	 */
	public IMemento createMemento();
	
	/**
	 * 恢复状态
	 */
	public void setMemento(IMemento memento);
}
