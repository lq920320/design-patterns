package com.interpreter;

/*
 * 上下文环境
 */
public class Context {
	/**
	 * 解析
	 */
	public String tracnlator(String expression) {
		/**
		 * 分割表达式
		 */
		String[] split = expression.split(" ");
		
		/**
		 * 构造解析对象
		 */
		Translator msgCode = new MsgCode(split[0]);
		Translator msgLanguage = new MsgLanguage(msgCode, split[1]);
		
		/**
		 * 解析
		 */
		return msgLanguage.translate(this);
	}
}
