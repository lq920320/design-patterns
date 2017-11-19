package com.composite;

/**
 * 自定义不支持方法的异常
 * @author liuqian
 *
 */
public class UnsupportedMethodException extends Exception {
	public UnsupportedMethodException(){
		super("非组合对象不支持此方法的异常");
	}

}
