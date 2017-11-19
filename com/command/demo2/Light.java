package com.command.demo2;

/*
 * 接收者，灯
 */
public class Light {
	//灯的状态，true为开着，false为关闭
	private boolean open = false;
	
	public boolean isOpen(){
		return open;
	}
	
	public void setOpen(boolean open){
		if(this.open == open){
			return;
		} else {
			this.open = open;
			System.out.println("灯状态修改为：" + (open ? "打开" : "关闭"));
		}
	}
	
	//开灯方法
	public void turnOnLight(){
		this.setOpen(true);
	}
	
	//关灯方法
	public void turnOffLight(){
		this.setOpen(false);
	}
}
