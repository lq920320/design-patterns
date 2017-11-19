package com.observer.demo2;

/**
 * 商品发布类
 * @author liuqian
 *
 */
public class GoodsPublisher extends Subject {

	/**
	 * 维护着最新的消息
	 */
	private String news;
	
	public void setNews(String news){
		/**
		 * 消息改变时通知
		 */
		if (news != null && !news.equals(this.news)){
			this.news = news;
			this.notify(news);
		}
	}
}
