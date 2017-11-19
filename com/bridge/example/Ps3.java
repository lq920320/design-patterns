package com.bridge.example;
/**
 * Ps3主机
 * @author liuiqian
 *
 */
public class Ps3 extends Host {

	public Ps3(Handle handle, GameContainer gameContainer) {
		super(handle, gameContainer);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Ps3开始工作了！");
		//调用委托方法
		this.gameLoad();
		this.handleWork();
	}

}
