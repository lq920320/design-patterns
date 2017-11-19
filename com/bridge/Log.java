package com.bridge;
/**
 * 日志抽象类
 * @author liuiqian
 *
 */
public abstract class Log {
	//聚合了实现
	protected LogSave logSave;
	
	/**
	 * 构造方法执行时进行聚合
	 */
	public Log(LogSave logSave) {
		this.logSave = logSave;
	}
	
	//此处抽象由具体实现类实现
	public abstract void writeToLog();
}
