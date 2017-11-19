package com.mediator;
/*
 * 同事A
 */
public class AColleagueImpl implements IColleague {

	/**
	 * 聚合调停者对象
	 */
	private IMediator mediator;
	
	public IMediator getMediator() {
		return mediator;
	}

	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	/**
	 * 改变方法
	 */
	public void change() {
		/**
		 * 委托调停者运行改变方法
		 */
		System.out.println("AColleagueImpl 改变");
		mediator.changed(this);
	}


	@Override
	public void action() {
		System.out.println("AColleagueImpl 得到运行");
	}

}
