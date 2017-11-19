package com.mediator;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建调停者
		 */
		MediatorImpl mediator = new MediatorImpl();

		/**
		 * 构造所有同事对象
		 */
		mediator.createColleagues();

		/**
		 * 获得同事对象
		 */
		AColleagueImpl aColleagueImpl = mediator.getaColleagueImpl();
		BColleagueImpl bColleagueImpl = mediator.getbColleagueImpl();

		/**
		 * 对象互动
		 */
		aColleagueImpl.change();
		System.out.println();
		bColleagueImpl.change();
	}

}
