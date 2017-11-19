package com.flyweight;

import java.awt.Dimension;
import java.awt.Font;
import java.util.LinkedList;
import java.util.List;

public class FwPoster extends PosterElementFlyweight {
	/**
	 * 元素列表
	 */
	private List<PosterElementFlyweight> elist;

	/**
	 * 元素使用的字体
	 */
	private Font font;

	/**
	 * 保存上下文
	 */
	private PosterContext ctx;
	
	/**
	 * 元素大小，供图片使用
	 */
	private Dimension dimension;

	public List<PosterElementFlyweight> getElist() {
		return elist;
	}

	public void setElist(List<PosterElementFlyweight> elist) {
		this.elist = elist;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public PosterContext getCtx() {
		return ctx;
	}

	public void setCtx(PosterContext ctx) {
		this.ctx = ctx;
	}
	
	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	/**
	 * 构造方法
	 */
	public FwPoster(){
		this.elist = new LinkedList<>();
	}

	/**
	 * 绘画方法
	 */
	@Override
	public void draw(Font font, Dimension dimension, PosterContext ctx) {
		// 如果自身已有内蕴属性，则用自己的，否则用传入的
		this.font = (this.font == null ? font : this.font);
		this.dimension = (this.dimension == null ? dimension : this.dimension);
		this.ctx = (this.ctx == null ? ctx : this.ctx);
		//操作集合的对象
		for(PosterElementFlyweight e : elist){
			e.draw(this.font, this.dimension, this.ctx);
		}

	}
	/**
	 * 设置内蕴状态
	 */
	public void setStatus(Font font, Dimension dimension, PosterContext ctx){
		this.font = font;
		this.dimension = dimension;
		this.ctx = ctx;
	}

}
