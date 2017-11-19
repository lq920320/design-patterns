package com.bridge;

public class UserLog extends Log {

	public UserLog(LogSave logSave) {
		super(logSave);
	}

	@Override
	public void writeToLog() {
		System.out.println("写入UserLog数据");
		//调用桥接过来的对象
		this.logSave.write();
	}

}
