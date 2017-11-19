package com.bridge.example;

/**
 * 可以更换配件的游戏机测试类
 * 
 * @author liuiqian
 * 
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("测试一种组合");
		Host host = new Ps3(new ButtonHandle(), new DVD());
		host.work();
		
		System.out.println("测试另一种组合");
		Host host2 = new Xbox360(new WheelHandle(), new HardDisk());
		host2.work();
	}
}
