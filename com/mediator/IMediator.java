package com.mediator;

/**
 * 调停者接口
 * @author liuqian
 *
 */
public interface IMediator {
	/**
	 * 通知改变方法
	 */
	void changed(IColleague colleague);
	
	/**
	 * 创建所有同事对象
	 */
	void createColleagues();
}
