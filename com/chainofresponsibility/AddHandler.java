package com.chainofresponsibility;

/**
 * 具体处理类，加法
 * 
 * @author liuqian
 * 
 */
public class AddHandler extends Handler {

	/**
	 * 重写父类方法
	 */
	@Override
	public Object handle(double num1, double num2, String calaulateType) {
		// 如果是加法就处理，如果不是就调用父类的默认处理方法
		if (calaulateType.equals("+")) {
			return num1 + num2;
		} else {
			return super.handle(num1, num2, calaulateType);
		}
	}

}
