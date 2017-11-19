package com.chainofresponsibility2;

/**
 * 签字者：经理
 * @author liuqian
 *
 */
public class ManagerSign extends Sign {

	/**
	 * 重写签字方法
	 */
	@Override
	public void sign(Record record) {
		// 在指定的位置签字
		record.setManagerSign(true);
		/**
		 * 调用父类的签字方法进行下一个人员签字
		 */
		super.sign(record);
	}
	
	
}
