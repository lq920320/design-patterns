package com.iterator2;

import java.util.LinkedList;
import java.util.List;

/**
 * 购物车类
 * @author liuqian
 *
 */
public class CarImpl implements ICar {

	private List<Goods> goodsList;
	
	/**
	 * 得到集合大小
	 * @return
	 */
	public int getSize(){
		return goodsList.size();
	}
	/**
	 * 取得集合元素
	 * @param index
	 * @return
	 */
	public Goods getItem(int index){
		return goodsList.get(index);
	}
	/**
	 * 构造方法
	 */
	public CarImpl(){
		goodsList = new LinkedList<>();
	}
	
	/**
	 * 加入元素方法
	 * @param goods
	 */
	public void add(Goods goods){
		goodsList.add(goods);
	}
	
	/**
	 * 迭代器方法
	 */
	@Override
	public IIterator createIterator() {
		return new IteratorImpl(this);
	}

	@Override
	public IIterator createSortIterator() {
		// TODO Auto-generated method stub
		return new IteratorSortImpl(this);
	}

}
