package com.memento.demo2;

/**
 * 命令接口
 * @author liuqian
 *
 */
public interface ICommand {
	/**
	 * 执行方法，采用动态参数
	 */
	void execute(Object... objects);
	
	/**
	 * 撤销方法
	 */
	void undo();
}
