package com.builderFactory;

import java.util.List;

/**
 * 抽象导演类
 * 
 * @author liuiqian
 * 
 */
public abstract class Director {

	/**
	 * 聚合的一个具体创建对象
	 */
	private Builder builder;

	public Builder getBuilder() {
		return this.builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 构造方法
	 */
	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	/**
	 * 构建产品
	 */
	public abstract List construct();
}
