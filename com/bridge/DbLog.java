package com.bridge;

public class DbLog extends Log{

	public DbLog(LogSave logSave) {
		super(logSave);
	}

	@Override
	public void writeToLog() {
		System.out.println("写入DbLog数据");
		//调用桥接过来的对象
		this.logSave.write();
	}

}
