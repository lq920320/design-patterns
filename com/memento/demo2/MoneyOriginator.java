package com.memento.demo2;

/**
 * 财务信息原发器类，单例模式
 * 
 * @author liuqian
 * 
 */
public class MoneyOriginator implements IOriginator {

	/**
	 * 采用Initialization on Demand Holder idiom 构造单例类
	 * 
	 * 内部静态类，单例持有者
	 * 
	 */
	static class SingletonHolder {
		static MoneyOriginator instance = new MoneyOriginator();
	}

	public static MoneyOriginator getInstance() {
		return SingletonHolder.instance;
	}

	private MoneyOriginator() {
	}
	
	/**
	 * 内部状态
	 */
	private float money = 0;
	
	public float getMoney() {
		return money;
	}
	
	public void setMoney(float money) {
		System.out.println("set money" + money);
		this.money = money;
	}

	@Override
	public IMemento createMemento() {
		return this.new MoneyMemento(this);
	}

	@Override
	public void setMemento(IMemento memento) {
		this.setMoney(((MoneyMemento)memento).getState());
	}
	
	/**
	 * 备忘录，内部类
	 */
	private class MoneyMemento implements IMemento {
		/**
		 * 保存的状态
		 */
		private float state;

		public float getState() {
			return state;
		}

		public void setState(float state) {
			this.state = state;
		}
		
		/**
		 * 构造方法
		 */
		public MoneyMemento(MoneyOriginator originator){
			this.state = originator.getMoney();
		}
		
	}

}
