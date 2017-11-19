package com.iterator;
/**
 * 迭代器抽象类
 * @author liuqian
 *
 */
public abstract class Iterator {

	/**
	 * 移动至集合头部
	 */
	public abstract void first();
	
	/**
	 * 移动至下一个元素
	 */
	public abstract void next();
	
	/**
	 * 是否已经达到集合尾部
	 */
	public abstract boolean isDone();
	
	/**
	 * 返回当前元素
	 */
	public abstract Object currentItem();
}
