package com.mediator;
/*
 * 具体调停者
 */
public class MediatorImpl implements IMediator {

	/**
	 * 聚合同事对象
	 */
	AColleagueImpl aColleagueImpl;
	BColleagueImpl bColleagueImpl;
	
	public AColleagueImpl getaColleagueImpl() {
		return aColleagueImpl;
	}

	public void setaColleagueImpl(AColleagueImpl aColleagueImpl) {
		this.aColleagueImpl = aColleagueImpl;
	}

	public BColleagueImpl getbColleagueImpl() {
		return bColleagueImpl;
	}

	public void setbColleagueImpl(BColleagueImpl bColleagueImpl) {
		this.bColleagueImpl = bColleagueImpl;
	}

	/**
	 * 通知改变方法
	 */
	@Override
	public void changed(IColleague colleague) {
		// 标记改变时的处理
		aColleagueImpl.action();
		bColleagueImpl.action();
	}

	/**
	 * 创建所有同事对象
	 */
	@Override
	public void createColleagues() {
		/*
		 * 实例化
		 */
		aColleagueImpl = new AColleagueImpl();
		bColleagueImpl = new BColleagueImpl();
		
		/**
		 * 设置依赖
		 */
		aColleagueImpl.setMediator(this);
		bColleagueImpl.setMediator(this);

	}

}
