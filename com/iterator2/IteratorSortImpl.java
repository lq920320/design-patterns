package com.iterator2;
/**
 * 排序迭代器
 * @author liuqian
 *
 */
public class IteratorSortImpl implements IIterator {

	/**
	 * 当前索引
	 */
	private int index;
	
	/**
	 * 排好序的集合
	 */
	private Goods[] goodsArray;
	
	/**
	 * 构造方法
	 * @param carImpl
	 */
	public IteratorSortImpl(CarImpl carImpl){
		/**
		 * 复制集合
		 */
		goodsArray = new Goods[carImpl.getSize()];
		for(int i = 0; i < carImpl.getSize(); i++){
			goodsArray[i] = carImpl.getItem(i);
		}
		
		/**
		 * 排序
		 */
		sort();
		
		first();
	}
	
	/**
	 * 冒泡排序
	 */
	public void sort(){
		for (int i = 0; i < goodsArray.length - 1; i++){
			for (int j = 0; j < goodsArray.length - i - 1; j++){
				/**
				 * 按照金额从小到大排列
				 */
				if(goodsArray[j].getPrice() > goodsArray[j + 1].getPrice()){
					Goods temp = goodsArray[j + 1];
					goodsArray[j + 1] = goodsArray[j];
					goodsArray[j] = temp;
				}
			}
		}
	}
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index < goodsArray.length){
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		if(index >= goodsArray.length){
			return true;
		}
		return false;
	}

	@Override
	public Goods currentItem() {
		return goodsArray[index];
	}

}
