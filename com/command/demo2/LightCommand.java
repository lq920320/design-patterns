package com.command.demo2;

/**
 * 具体的
 * @author liuqian
 *
 */
public class LightCommand implements Command {

	// 委托的接收者
	private Light light;
	
	//保存此动作是否成功修改的数据
	private boolean change;
	
	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public boolean isChange() {
		return change;
	}

	public void setChange(boolean change) {
		this.change = change;
	}
	
	//构造方法
	public LightCommand(Light light){
		this.light = light;
		change = false;
	}

	@Override
	public void execute() {
		if(light.isOpen()){
			System.out.println("灯未做操作。");
		}else{
			light.turnOnLight();
			System.out.println("灯已打开。");
			change = true;
		}
	}

	@Override
	public void undo() {
		if (change){
			light.turnOffLight();
			System.out.println("灯已关闭。");
		} else {
			System.out.println("灯未做操作。");
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
