package com.bridge;

public class TradLog extends Log {

	public TradLog(LogSave logSave) {
		super(logSave);
	}

	@Override
	public void writeToLog() {
		// TODO Auto-generated method stub
		System.out.println("写入TradLog数据");
		//调用桥接过来的对象
		this.logSave.write();
	}

}
