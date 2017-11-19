package com.chainofresponsibility2;
/**
 * 
 * @author liuqian
 *
 */
public abstract class Sign {

	/**
	 * 下一个签名者
	 */
	private Sign next;

	public Sign getNext() {
		return next;
	}

	public void setNext(Sign next) {
		this.next = next;
	}
	
	/**
	 * 签字方法
	 */
	public void sign(Record record){
		if (next == null){
			return;
		} else {
			next.sign(record);
		}
	}
}
