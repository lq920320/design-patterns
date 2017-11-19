package com.iterator;

/**
 * 具体集合类
 * @author liuqian
 *
 */
public class AggregateImpl extends Aggregate {

	/**
	 * 一个集合
	 */
	private int[] aIntList;
	
	/**
	 * 构造方法
	 */
	public AggregateImpl() {
		aIntList = new int[] {3, 4, 6, 2, 9};
	}
	/**
	 * 得到集合大小
	 * @return
	 */
	public int getSize(){
		return aIntList.length;
	}
	
	/**
	 * 取得集合元素
	 * @param index
	 * @return
	 */
	public int getItem(int index){
		return aIntList[index];
	}
	
	/**
	 * 创建迭代器
	 */
	@Override
	public Iterator createIterator() {
		return new IteratorImpl(this);
	}

}
