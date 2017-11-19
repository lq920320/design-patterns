package com.proxy;

/**
 * 手机实现类
 * 
 * @author liuiqian
 * 
 */
public class MobilePhone implements Phone {

	/**
	 * 品牌名称
	 */
	private String brand;

	/**
	 * 手机型号
	 */
	private String series;

	/**
	 * 手机颜色
	 */
	private String color;

	/**
	 * 重写接口方法
	 */
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String getSeries() {
		// TODO Auto-generated method stub
		return series;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub\
		System.out.println(getColor() + "颜色的" + getBrand() + getSeries()
				+ "手机开始拨打电话！");
	}

	/**
	 * 带参数的构造方法
	 */
	public MobilePhone(String brand, String series, String color) {
		this.brand = brand;
		this.series = series;
		this.color = color;
	}

	/**
	 * 不带参数构造方法
	 */
	public MobilePhone() {
	}

	/**
	 * 用于Map中比较是否一致 需要重写equals方法
	 */
	public boolean equals(Object object) {
		MobilePhone mp = null;
		try {
			mp = (MobilePhone) object;
		} catch (Exception e) {
			// 如果转换出现异常返回假
			return false;
		}
		if (getBrand().equals(mp.getBrand())
				&& getSeries().equals(mp.getSeries())
				&& getColor().equals(mp.getColor())) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 用于Map中比较是否一致
	 * 需要重写hashCode方法
	 * 按照JAVA的要求，equals和hashCode必须结果一致，这里的算法只起到演示作用
	 */
	public int hashCode() {
		return getBrand().hashCode() & getColor().hashCode() & getSeries().hashCode();
	}

}
