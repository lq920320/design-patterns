package com.iterator2;
/**
 * 普通迭代器
 * @author liuqian
 *
 */
public class IteratorImpl implements IIterator {

	/*
	 * 当前索引
	 */
	private int index;
	
	/**
	 * 集合
	 */
	private CarImpl carImpl;
	
	/**
	 * 构造方法
	 * @param carImpl
	 */
	public IteratorImpl(CarImpl carImpl){
		this.carImpl = carImpl;
		first();
	}
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < carImpl.getSize()){
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		if(index >= carImpl.getSize()){
			return true;
		}
		return false;
	}

	@Override
	public Goods currentItem() {
		return carImpl.getItem(index);
	}

}
