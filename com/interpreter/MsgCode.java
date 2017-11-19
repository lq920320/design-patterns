package com.interpreter;

/*
 * 消息编码
 */
public class MsgCode implements Translator {
	/**
	 * 存放的编号
	 */
	private String code;
	
	public MsgCode(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String translate(Context ctx) {
		return code;
	}

}
