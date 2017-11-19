package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;

public class PosterClient {

	/**
	 * 测试享元对象
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 生成上下文，设置纸张大小
		PosterContext ctx = new PosterContext(new Dimension(1024, 768));
		// 创建工厂
		PosterElementFactory fac = PosterElementFactory.getFactory();

		// 创建一个文本区域
		FwPoster textSpan_1 = fac.getPoster(
				PosterElementFactory.ElementType_Charactor, "中文");

		textSpan_1.setStatus(fac.getFont(new Font("宋体", Font.PLAIN, 12)),
				new Dimension(0, 0), ctx);
		// 创建图片区域
		FwPoster imageSpan_1 = fac.getPoster(
				PosterElementFactory.ElementType_Image, "image_1");
		imageSpan_1.setStatus(null, new Dimension(100, 200), ctx);

		// 创建一个文本区域
		FwPoster textSpan_2 = fac.getPoster(
				PosterElementFactory.ElementType_Charactor, "zoo");

		textSpan_2.setStatus(fac.getFont(new Font("Century", Font.BOLD, 12)),
				new Dimension(0, 0), ctx);
		// 创建图片区域
		FwPoster imageSpan_2 = fac.getPoster(
				PosterElementFactory.ElementType_Image, "image_2");
		imageSpan_2.setStatus(null, new Dimension(50, 100), ctx);

		// 创建组合对象
		FwPoster compPoster = new FwPoster();
		compPoster.getElist().add(textSpan_1);
		compPoster.getElist().add(imageSpan_1);
		compPoster.getElist().add(textSpan_2);
		compPoster.getElist().add(imageSpan_2);

		// 打印， 可以不给出各种参数，意为使用组合的内蕴状态
		compPoster.draw(null, null, null);

	}

}
