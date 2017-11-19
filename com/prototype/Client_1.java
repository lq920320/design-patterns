package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 克隆简单对象
		 */
		SampleClass sc = new SampleClass(99);
		Prototype scc = sc.clone();
		
		/**
		 * 判断对象是否相同的指针
		 */
		System.out.println("sc==scc ? " + (sc == scc));
		/**
		 * 判断值是否相等
		 */
		System.out.println("sc: " + sc.toString());
		System.out.println("scc: " + scc.toString());
		
		/**
		 * 克隆复杂对象
		 */
		ComplexClass cc = new ComplexClass();
		cc.setStr("一个字符串");
		List list = new ArrayList();
		list.add("字串");
		list.add(25);
		cc.setList(list);
		
		Prototype ccc = cc.clone();
		
		/**
		 * 判断对象是否相同的指针
		 */
		System.out.println("cc==ccc ? " + (cc == ccc));
		/**
		 * 判断值是否相等
		 */
		System.out.println("cc: " + cc.toString());
		System.out.println("ccc: " + ccc.toString());
	}

}
