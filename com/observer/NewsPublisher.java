package com.observer;

/*
 * 新闻发布类
 */
public class NewsPublisher extends Subject {
	
	//维护着最新的消息
	private String news;
	
	public void setNews(String news){
		/**
		 * 消息改变时通知
		 */
		if (news != null && !news.equals(this.news)) {
			this.news = news;
			/**
			 * 通知监听器
			 */
			this.notifyObservers(news);
		}
	}
}
