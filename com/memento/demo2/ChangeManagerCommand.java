package com.memento.demo2;

/**
 * 修改经理人命令
 * 
 * @author liuqian
 * 
 */
public class ChangeManagerCommand implements ICommand {

	/**
	 * 保存备忘录
	 */
	private IMemento memento;

	@Override
	public void execute(Object... objects) {
		// 创建备忘录
		memento = ManagerOriginator.getInstance().createMemento();

		/**
		 * 执行改变，这里需要传递一个String类型的参数
		 */
		if (objects.length == 1) {
			ManagerOriginator.getInstance().setManagerName((String) objects[0]);
		} else {
			throw new RuntimeException("参数不合法");
		}
	}

	/**
	 * 撤销命令
	 */
	@Override
	public void undo() {
		ManagerOriginator.getInstance().setMemento(memento);
	}

}
