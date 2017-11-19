package com.state.demo1;

/**
 * 商店
 * 
 * @author liuqian
 * 
 */
public class Shop {
	/**
	 * 商店状态 "ready"准备开门，"open"开门， "close"关门
	 */
	private String state;
	
	/**
	 * 商店名称
	 */
	private String name;
	
	/**
	 * 构造方法
	 * @param name
	 * @param state
	 */
	public Shop(String name, String state){
		super();
		this.state = state;
		this.name = name;
	}
	
	/**
	 * 商店“准备开门”方法
	 */
	public void ready() {
		/**
		 * 只有当状态是close时准备开门才是合适的
		 */
		if(state.equals("close")){
			state = "ready";
		} else {
			throw new RuntimeException("状态不正确");
		}
	}
	
	/**
	 * 商店“开门”方法
	 */
	public void open() {
		/**
		 * 只有当状态是ready时开门才是合适的
		 */
		if(state.equals("ready")){
			state = "open";
		} else {
			throw new RuntimeException("状态不正确");
		}
	}
	
	/**
	 * 商店“关门”方法
	 */
	public void close(){
		/**
		 * 只有当状态是ready或open时关门才是合适的
		 */
		if(state.equals("ready") || state.equals("open")){
			state = "close";
		} else {
			throw new RuntimeException("状态不正确");
		}
	}
	
	/**
	 * 查询状态
	 */
	public void checkState() {
		if (state.equals("open")){
			System.out.println(name + "开门啦！");
		}
		if (state.equals("ready")) {
			System.out.println(name + "准备开门啦！");
		}
		if (state.equals("close")) {
			System.out.println(name + "关门了");
		}
	}
}
