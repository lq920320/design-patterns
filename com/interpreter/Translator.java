package com.interpreter;

/**
 * 翻译接口
 * @author liuqian
 *
 */
public interface Translator {
	/**
	 * 公用的翻译方法
	 * @param ctx
	 * @return
	 */
	public String translate(Context ctx);
}
