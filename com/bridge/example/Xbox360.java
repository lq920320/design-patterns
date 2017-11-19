package com.bridge.example;
/**
 * Xbox360主机
 * @author liuiqian
 *
 */
public class Xbox360 extends Host {

	public Xbox360(Handle handle, GameContainer gameContainer) {
		super(handle, gameContainer);
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Xbox360工作了！");
		//调用委托方法
		this.gameLoad();
		this.handleWork();
	}

}
