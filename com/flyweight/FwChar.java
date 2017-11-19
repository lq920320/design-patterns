package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

import sun.font.FontDesignMetrics;
/**
 * 具体字符类
 * @author liuqian
 *
 */
public class FwChar extends PosterElementFlyweight {

	/**
	 * 内蕴状态
	 */
	private char achar;
	
	public char getAchar() {
		return achar;
	}


	public void setAchar(char achar) {
		this.achar = achar;
	}

	/**
	 * 设置内蕴状态
	 * @param c
	 */
	public FwChar(char c){
		this.setAchar(c);
	}
	
	/**
	 * 设置外蕴状态
	 */
	@Override
	public void draw(Font font, Dimension dimension, PosterContext ctx) {
		// 输出字符
		System.out.println("字符：" + getAchar());
		System.out.println("\t位置： X:" + ctx.getNowPosition().x
				+ " Y:" + ctx.getNowPosition().y);
		System.out.println("\t字体：" + font.toString());
		//设置上下文状态
		FontMetrics fm = FontDesignMetrics.getMetrics(font);
		ctx.put(new Dimension(fm.charWidth(getAchar()), fm.getHeight()));

	}

}
