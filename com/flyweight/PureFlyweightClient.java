package com.flyweight;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;

/**
 * 单纯享元模式的测试类
 * @author liuqian
 *
 */
public class PureFlyweightClient {

	/**
	 * 显示OOP三个字符
	 * @param args
	 */
	public static void main(String[] args) {
		// 显示Flyweight对象缓存池状态
		CharFlyweightFactory.showStatus();
		CharFlyweight char1 = CharFlyweightFactory.getCharFlyweight('O');
		CharFlyweight char2 = CharFlyweightFactory.getCharFlyweight('O');
		CharFlyweight char3 = CharFlyweightFactory.getCharFlyweight('P');
		// 显示Flyweight对象缓存池状态
		CharFlyweightFactory.showStatus();
		//输出 字符
		char1.draw(new Point(0, 0), Color.red, new Font("宋体", Font.BOLD, 1));
		char2.draw(new Point(1, 1), Color.red, new Font(Font.SERIF, Font.ITALIC, 5));
		char3.draw(new Point(2, 5), Color.red, new Font(Font.MONOSPACED, Font.PLAIN, 8));
	}

}
