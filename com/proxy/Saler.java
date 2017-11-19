package com.proxy;
/**
 * 销售人员
 * @author liuiqian
 *
 */
public class Saler {
	/**
	 * 挑选手机，销售人员提供模型机
	 */
	public Phone choosePhone(String brand, String series, String color){
		return new DummyPhone(brand,series,color);
	}
	
	/**
	 * 购买手机，此时销售人员提供真机
	 */
	public Phone buyPhone(String brand, String series, String color){
		Depot.getInstance();
		Phone phone = Depot.getPhone(brand, series, color);
		if(phone == null){
			System.out.println(color + "色" + brand + series + "手机无货");
			return null;
		}
		System.out.println("购买" + phone.getColor() + "色" + phone.getBrand() 
				+ phone.getSeries() + "一部");
		return phone;
	}
}
