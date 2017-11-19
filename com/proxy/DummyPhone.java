package com.proxy;

/**
 * 手机模型
 * 
 * @author liuiqian
 * 
 */
public class DummyPhone implements Phone {

	/**
	 * 需要代理的业务对象
	 */
	private Phone realPhone;

	public Phone getRealPhone() {
		return realPhone;
	}

	public void setRealPhone(Phone realPhone) {
		this.realPhone = realPhone;
	}

	/**
	 * 带参数 的构造方法
	 */
	public DummyPhone(String brand, String series, String color) {
		realPhone = new MobilePhone(brand, series, color);
	}

	/**
	 * 不带参数的构造方法
	 */
	public DummyPhone() {
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return realPhone.getBrand();
	}

	@Override
	public String getSeries() {
		// TODO Auto-generated method stub
		return realPhone.getSeries();
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return realPhone.getColor();
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println(getColor() + "颜色的" + 
		getBrand() + getSeries() + "手机模型无法拨打电话");

	}

}
