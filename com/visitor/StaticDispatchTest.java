package com.visitor;
/**
 * 方法重载的静态分派
 * @author liuqian
 *
 */
public class StaticDispatchTest {

	public static void main(String[] args) {
		Person p = new Person();
		
		/**
		 * 编译时就被确定其类型
		 * 所以匹配正确
		 */
		Apple x = new Apple();
		Orange y = new Orange();
		p.eat(x);
		p.eat(y);

		/**
		 * 编译时就被确定其类型
		 * 所以匹配的是eat(Fruit fruit)
		 */
		Fruit a = new Apple();
		Fruit b = new Orange();
		
		p.eat(a);
		p.eat(b);
	}

}

/**
 * 抽象水果类
 * @author liuqian
 *
 */
abstract class Fruit {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void useage() {
		System.out.println("直接吃水果");
	}
	
}

/*
 * 苹果
 */
class Apple extends Fruit{
	public Apple() {
		super();
		this.setName("苹果");
	}
	
	public void useage() {
		System.out.println("洗洗吃苹果");
	}
}

/*
 * 橘子
 */
class Orange extends Fruit{
	public Orange() {
		super();
		this.setName("橘子");
	}
	
	public void useage() {
		System.out.println("剥皮吃橘子");
	}
}


/**
 * 人，方法重载
 */
class Person {
	public void eat(Fruit fruit){
		System.out.println("吃水果");
	}
	
	public void eat(Apple fruit){
		System.out.println("吃苹果");
	}
	
	public void eat(Orange fruit){
		System.out.println("吃橘子");
	}
}
