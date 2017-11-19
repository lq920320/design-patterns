package com.command.demo2;

import java.util.LinkedList;
import java.util.List;

/*
 * 命令调用者
 */
public class Invoker {
	/**
	 * 保存命令的集合
	 */
	private List<Command> list = new LinkedList<>();

	public List<Command> getList() {
		return list;
	}

	public void setList(List<Command> list) {
		this.list = list;
	}
	
	/**
	 * 保存当前命令集合中的位置
	 */
	private int position = -1;
	
	/**
	 * 执行命令
	 * @param command
	 */
	public void executeCommmand(Command command) {
		/**
		 * 加入命令队列
		 */
		list.add(++position, command);
		//执行命令
		command.execute();
		
		/**
		 * 将集合尾部的多余命令删除
		 */
		if(position < this.getList().size() - 1){
			for (int i = this.getList().size() -1; i > position; i --){
				this.getList().remove(i);
			}
		}
	}
	
	/**
	 * 重做命令
	 */
	public void redoCommand() {
		if (this.getList().size() -1 > position){
			/**
			 * 执行命令
			 */
			this.getList().get(++position).redo();
		} else {
			System.out.println("命令无效");
		}
	}
	
	/**
	 * 撤销命令
	 */
	public void undoCommand() {
		if (position >= 0){
			//撤销
			this.getList().get(position--).undo();
		}
	}
}
