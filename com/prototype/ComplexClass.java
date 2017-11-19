package com.prototype;

import java.util.List;

/**
 * 实现了原型模式的复杂类
 * @author liuiqian
 *
 */
public class ComplexClass implements Prototype {

	/**
	 * 一个字符串
	 */
	private String str;
	
	/**
	 * 一个集合
	 */
	private List list;
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public Prototype clone() {
		// TODO Auto-generated method stub
		ComplexClass cc = new ComplexClass();
		cc.setList(this.getList());
		cc.setStr(this.getStr());
		return cc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getStr() + " " + this.getList();
	}

	
}
