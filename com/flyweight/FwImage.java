package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;

public class FwImage extends PosterElementFlyweight {

	/**
	 * 内蕴状态
	 */
	private String imgName;
	
	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
	/**
	 * 构造方法
	 */
	public FwImage(String imgName){
		this.imgName = imgName;
	}

	/**
	 * 设置外蕴状态
	 */
	@Override
	public void draw(Font font, Dimension dimension, PosterContext ctx) {
		// 显示图片
		System.out.println("图片：" + getImgName());
		System.out.println("\t位置： X:" + ctx.getNowPosition().x
				+ " Y:" + ctx.getNowPosition().y);
		System.out.println("\t大小：w:" + dimension.width + " h:"
				+ dimension.height);
		//设置上下文状态
		ctx.put(dimension);
	}

}
