package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;

/**
 * 海报元素抽象类
 * @author liuqian
 *
 */
public abstract class PosterElementFlyweight {

	abstract public void draw(Font font, Dimension dimension, PosterContext ctx);
}
