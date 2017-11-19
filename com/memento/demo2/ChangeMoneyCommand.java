package com.memento.demo2;

/**
 * 修改备忘录
 * 
 * @author liuqian
 * 
 */
public class ChangeMoneyCommand implements ICommand {

	/**
	 * 保存备忘录
	 */
	private IMemento memento;

	/**
	 * 执行命令
	 */
	@Override
	public void execute(Object... objects) {
		// 创建备忘录
		memento = MoneyOriginator.getInstance().createMemento();

		/**
		 * 执行改变，这里需要传递一个String类型的参数
		 */
		if (objects.length == 1) {
			MoneyOriginator.getInstance().setMoney((Float) objects[0]);
		} else {
			throw new RuntimeException("参数不合法");
		}
	}

	@Override
	public void undo() {
		MoneyOriginator.getInstance().setMemento(memento);
	}

}
