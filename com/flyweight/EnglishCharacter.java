package com.flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

public class EnglishCharacter extends CharFlyweight {

	/**
	 * 设置内蕴状态
	 * @param englishChar
	 */
	public EnglishCharacter(char englishChar) {
		super(englishChar);
	}

	/**
	 * 设置外蕴状态
	 */
	@Override
	public void draw(Point position, Color color, Font font) {
		System.out.println("字符：" + getEnglishChar());
		System.out.println("\t位置：X:" + position.getX() + " Y:"
				+ position.getY());
		System.out.println("\t颜色：" + color.toString());
		System.out.println("\t字体：" + font.toString());
	}

}
