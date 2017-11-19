package com.singleton;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final ThreadPair tp = new ThreadPair();
		/**
		 * 创建两个线程
		 */
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					tp.setS1(SingletonRegister.getInstance("com.singleton.MainShop"));
				} catch (InstantiationException e){
					e.printStackTrace();
				}catch (IllegalAccessException e){
					e.printStackTrace();
				}catch (ClassNotFoundException e){
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					tp.setS2(SingletonRegister.getInstance("com.singleton.MainShop"));
				} catch (InstantiationException e){
					e.printStackTrace();
				}catch (IllegalAccessException e){
					e.printStackTrace();
				}catch (ClassNotFoundException e){
					e.printStackTrace();
				}
			}
		});
		/**
		 * 启动线程
		 */
		t1.setName("线程甲");
		t2.setName("线程乙");
		t1.start();
		t2.start();
		/**
		 * 加入线程等待
		 */
		t1.join();
		t2.join();
		
		System.out.println("相同的对象？" + tp.isEquals());
	}
}

class ThreadPair {
	private Object s1;
	private Object s2;

	public Object getS1() {
		return s1;
	}

	public void setS1(Object s1) {
		this.s1 = s1;
	}

	public Object getS2() {
		return s2;
	}

	public void setS2(Object s2) {
		this.s2 = s2;
	}

	/**
	 * 判断是否为同一个对象
	 */
	public boolean isEquals() {
		System.out.println(s1 + "\n" + s2);
		return s1 == s2;
	}
}
