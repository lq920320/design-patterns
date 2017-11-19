package com.memento.demo2;

import java.util.LinkedList;
import java.util.List;

/**
 * 命令管理类，等同于负责人，单例模式
 * 
 * @author liuqian
 * 
 */
public class CommandManager {
	/**
	 * 采用 Initialization on Demand Holder idiom 构造单例类 
	 * 
	 * 内部静态类，单例持有者
	 */
	static class SingletonHolder {
		static CommandManager instance = new CommandManager();
	}
	
	public static CommandManager getInstance() {
		return SingletonHolder.instance;
	}
	
	private CommandManager() {}
	
	/**
	 * 保存命令序列
	 */
	private List<ICommand> commandList =  new LinkedList<>();
	
	/**
	 * 执行命令
	 */
	public void execute(ICommand command, Object...objects){
		System.out.println("执行命令" + command);
		/**
		 * 执行
		 */
		command.execute(objects);
		/**
		 * 保存
		 */
		commandList.add(command);
	}
	
	/**
	 * 取消命令
	 */
	public void undo() {
		if(commandList.size() > 0){
			/**
			 * 移除最后一条命令
			 */
			ICommand command =  commandList.remove(
					commandList.size() - 1);
			/**
			 * 取消命令
			 */
			System.out.println("取消命令" + command);
			command.undo();
		} else {
			System.out.println("命令队列中已空");
		}
	}
}
