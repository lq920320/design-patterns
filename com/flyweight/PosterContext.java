package com.flyweight;

import java.awt.Dimension;
import java.awt.Point;

/**
 * 海报上下文
 * @author liuqian
 *
 */
public class PosterContext {
	/**
	 * 纸张大小
	 */
	private Dimension pageSize;
	
	/**
	 * 当前位置
	 */
	private Point nowPosition;
	/**
	 * 构造方法
	 * @param pageSize
	 */
	public PosterContext(Dimension pageSize){
		this.pageSize = pageSize;
		//设置默认为位置
		this.setNowPosition(new Point(0, 0));
	}
	
	/**
	 * 放置一个元素，当前位置移动
	 */
	public void put(Dimension dimension) {
		//移动x坐标
		this.getNowPosition().x = this.getNowPosition().x + dimension.width;
		if(this.getNowPosition().x < 0 || this.getNowPosition().x > pageSize.width){
			throw new RuntimeException("超出纸张边界");
		}
	}

	public Dimension getPageSize() {
		return pageSize;
	}

	public void setPageSize(Dimension pageSize) {
		this.pageSize = pageSize;
	}

	public Point getNowPosition() {
		return nowPosition;
	}

	public void setNowPosition(Point nowPosition) {
		this.nowPosition = nowPosition;
	}
	
	
}
