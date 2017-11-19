package com.interpreter;

import java.util.Locale;
import java.util.ResourceBundle;

/*
 * 消息语言
 */
public class MsgLanguage implements Translator {

	/**
	 * 语言资源文件路径
	 */
	private String bName = "com.interpreter.msg";
	
	/**
	 * 存放需要操作的翻译内容
	 */
	private Translator trans;
	
	/**
	 * 存放需要翻译的语言
	 */
	private String lang;
	
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Translator getTrans() {
		return trans;
	}

	public void setTrans(Translator trans) {
		this.trans = trans;
	}
	
	/**
	 * 构造方法
	 * @param trans
	 * @param lang
	 */
	public MsgLanguage(Translator trans, String lang) {
		super();
		this.trans = trans;
		this.lang = lang;
	}

	/**
	 * 翻译方法
	 */
	@Override
	public String translate(Context ctx) {
		/**
		 * 绑定特定的资源文件
		 */
		ResourceBundle res = ResourceBundle.getBundle(bName, new Locale(lang));
		/**
		 * 返回翻译结果
		 */
		return res.getString(trans.translate(ctx));
	}

}
