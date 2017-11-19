package com.memento.demo2;

/*
 * 经理人信息原发器类，单例模式
 */
public class ManagerOriginator implements IOriginator {

	/**
	 * 采用Initialization on Demand Holder idiom 构造单例类
	 * 
	 * 内部静态类，单例持有者
	 *
	 */
	static class SingletonHolder{
		static ManagerOriginator instance = new ManagerOriginator();
	}
	
	public static ManagerOriginator getInstance() {
		return SingletonHolder.instance;
	}
	
	private ManagerOriginator() {}
	
	/**
	 * 内部状态
	 */
	private String managerName = "目前未设置";
	
	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		System.out.println("set managerName " + managerName);
		this.managerName = managerName;
	}

	/**
	 * 创建备忘录
	 */
	@Override
	public IMemento createMemento() {
		return this.new ManagerMemento(this);
	}

	/**
	 * 恢复备忘录
	 */
	@Override
	public void setMemento(IMemento memento) {
		this.setManagerName(((ManagerMemento)memento).getState());
	}
	
	/**
	 * 备忘录，内部类
	 */
	private class ManagerMemento implements IMemento {
		/**
		 * 保存的状态
		 */
		private String state;

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		public ManagerMemento(ManagerOriginator originator){
			this.state = originator.getManagerName();
		}
	}

}
