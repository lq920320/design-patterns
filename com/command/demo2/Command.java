package com.command.demo2;
/**
 * 命令接口
 * @author liuqian
 *
 */
public interface Command {
	/**
	 * 执行方法
	 */
	void execute();
	
	/**
	 * 撤销方法
	 */
	void undo();
	
	//重做方法
	void redo();
	
	
}
