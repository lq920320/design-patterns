package com.bridge.example;
/**
 * Host抽象类
 * @author liuiqian
 *
 */
public abstract class Host {
	/**
	 * 注意此处聚合的两个保护属性是桥接模式的精华所在，
	 * 实现了抽象和实现的分离
	 */
	protected Handle handle;
	
	protected GameContainer gameContainer;
	
	/**
	 * 构造方法
	 * @param handle 一个具体实现对象
	 * @param gameContainer 一个具体实现对象
	 */
	public Host(Handle handle, GameContainer gameContainer){
		super();
		this.handle = handle;
		this.gameContainer = gameContainer;
	}
	
	//游戏机的工作方法
	public abstract void work();
	
	/**
	 * 注意此处的两个配件工作方法，
	 * 把功能委托给了聚合的属性
	 */
	public void handleWork() {
		handle.handleWork();
	}
	
	public void gameLoad(){
		gameContainer.gameLoad();
	}
}
