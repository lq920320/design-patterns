package com.command.demo2;
/**
 * 接收者，煤气
 * @author liuqian
 *
 */
public class Gas {
	//煤气的状态，true为开着，false为关闭
	private boolean fire = false;

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		if(this.fire == fire){
			return;
		} else {
			this.fire = fire;
			System.out.println("煤气状态修改为：" + (fire ? "打开" : "关闭"));
		}
	}
	
	/**
	 * 打开煤气
	 */
	public void openFire(){
		this.setFire(true);
	}

	/**
	 * 关闭煤气
	 */
	public void closeFire(){
		this.setFire(false);
	}
}
