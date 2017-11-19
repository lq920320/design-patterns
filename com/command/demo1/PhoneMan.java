package com.command.demo1;

/**
 * 接线员
 * 
 * @author liuqian
 * 
 */
public class PhoneMan {

	public void service(ServiceType type) {
		switch (type) {
		case 投诉:
			new ServiceManA().answer();
			break;
		case 咨询:
			new ServiceManB().response();
			break;
		default:
			System.out.println("不支持此类操作");
			break;
		}
	}
}
