package com.interpreter;

public class Client {

	public static void main(String[] args) {
		/**
		 * 创建上下文
		 */
		Context ctx = new Context();
		
		/**
		 * 执行测试
		 */
		System.out.println("001 zh =>" + ctx.tracnlator("001 zh"));
		System.out.println("001 en =>" + ctx.tracnlator("001 en"));
		
		System.out.println("002 zh =>" + ctx.tracnlator("002 zh"));
		System.out.println("002 en =>" + ctx.tracnlator("002 en"));
	}

}
