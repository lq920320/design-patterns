package com.iterator2;

/**
 * 购物车接口
 * 
 * @author liuqian
 * 
 */
public interface ICar {
	/**
	 * 普通迭代器
	 */
	IIterator createIterator();
	
	/**
	 * 排序迭代器
	 */
	IIterator createSortIterator();
}
