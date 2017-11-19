package com.command.demo2;
/*
 * 具体命令
 */
public class GasCommand implements Command {

	/**
	 * 委托的接收者
	 */
	private Gas gas;
	
	private boolean change;
	
	public Gas getGas() {
		return gas;
	}

	public void setGas(Gas gas) {
		this.gas = gas;
	}

	public boolean isChange() {
		return change;
	}

	public void setChange(boolean change) {
		this.change = change;
	}
	
	/**
	 * 构造方法
	 * @param gas
	 */
	public GasCommand(Gas gas){
		this.gas = gas;
		change = false;
	}

	@Override
	public void execute() {
		if(gas.isFire()){
			System.out.println("煤气未做操作。");
		} else {
			gas.openFire();
			System.out.println("煤气已打开。");
			change = true;
		}
	}

	@Override
	public void undo() {
		if (change) {
			gas.closeFire();
			System.out.println("煤气已关闭。");
		} else {
			System.out.println("煤气未做操作。");
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
