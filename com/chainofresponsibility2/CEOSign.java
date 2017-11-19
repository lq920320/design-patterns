package com.chainofresponsibility2;

/**
 * 签字者：CEO
 * @author liuqian
 *
 */
public class CEOSign extends Sign {
	/**
	 * 重写签字方法
	 */
	@Override
	public void sign(Record record) {
		// 在指定的位置签字
		record.setCeoSign(true);
		/**
		 * 调用父类的签字方法进行下一个人员签字
		 */
		super.sign(record);
	}
}
