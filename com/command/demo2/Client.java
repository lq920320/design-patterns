package com.command.demo2;

public class Client {
	public static void main(String[] args) {
		//需要操作的物品
		Light light = new Light();
		Gas gas = new Gas();
		
		Invoker invoker = new Invoker();
		
		//执行命令
		invoker.executeCommmand(new GasCommand(gas));
		invoker.executeCommmand(new GasCommand(gas));
		
		invoker.undoCommand();
		invoker.undoCommand();
		
		invoker.redoCommand();
		
		invoker.executeCommmand(new LightCommand(light));
		invoker.redoCommand();
	}
}
