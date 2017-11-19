package com.flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

/**
 * 单纯享元模式抽象类
 * @author liuqian
 *
 */
public abstract class CharFlyweight {
	/**
	 * 内蕴状态
	 */
	private char englishChar;
	
	/**
	 * 外蕴状态
	 * @param position
	 * @param color
	 * @param font
	 */
	public abstract void draw(Point position, Color color, Font font);

	public CharFlyweight(char englishChar){
		super();
		this.englishChar = englishChar;
	}

	public char getEnglishChar() {
		return englishChar;
	}

	public void setEnglishChar(char englishChar) {
		this.englishChar = englishChar;
	}
	
	
}
