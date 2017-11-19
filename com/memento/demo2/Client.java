package com.memento.demo2;

/*
 * 备忘录模式 + 命令模式
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 创建负责人(命令管理器)
		 */
		CommandManager commandManager = CommandManager.getInstance();
		
		/**
		 * 执行命令
		 */
		commandManager.execute(new ChangeManagerCommand(), "包公");
		commandManager.execute(new ChangeMoneyCommand(), 555f);
		
		/**
		 * 回退命令
		 */
		commandManager.undo();
		commandManager.undo();
		commandManager.undo();
	}

}
