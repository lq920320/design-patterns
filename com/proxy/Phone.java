package com.proxy;
/**
 * 手机接口
 * @author liuiqian
 *
 */
public interface Phone {

	/**
	 * 得到手机品牌
	 */
	public String getBrand();
	
	/**
	 * 得到手机型号
	 */
	public String getSeries();
	
	/**
	 * 得到手机颜色
	 */
	public String getColor();
	
	/**
	 * 接通电话
	 */
	public void call();
}
