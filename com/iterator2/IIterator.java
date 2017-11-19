package com.iterator2;
/**
 * 迭代器接口
 * @author liuqian
 *
 */
public interface IIterator {
	/**
	 * 移动至集合头部
	 */
	void first();
	
	/**
	 * 移动至下一个元素
	 */
	void next();
	
	/**
	 * 是否已达到集合尾部
	 */
	boolean isDone();
	
	/**
	 * 返回当前元素
	 */
	Goods currentItem();
}
