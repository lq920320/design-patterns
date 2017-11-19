package com.command.demo1;
/**
 * 打客服电话的顾客
 * @author liuqian
 *
 */
public class Customer {
	
	public static void main(String[] args) {
		//拨打电话至客服
		PhoneMan phoneMan = new PhoneMan();
		/**
		 * 选择服务类型
		 */
		phoneMan.service(ServiceType.咨询);
		phoneMan.service(ServiceType.投诉);
	}
}
