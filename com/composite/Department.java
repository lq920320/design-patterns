package com.composite;

import java.util.Collection;
import java.util.LinkedList;

public class Department extends CompanyElement {

	private Collection<CompanyElement> children = new LinkedList<CompanyElement>();

	// 空参数构造方法
	public Department() {
		super();
	}

	// 带参数构造方法
	public Department(CompanyElement parent, String name, String job,
			float salary) {
		super(parent, name, job, salary);
	}

	@Override
	public void add(CompanyElement component) throws UnsupportedMethodException {
		component.setParent(this);
	}

	@Override
	public void remove(CompanyElement component)
			throws UnsupportedMethodException {
		// TODO Auto-generated method stub
		component.setParent(null);
	}

	@Override
	public Collection<CompanyElement> getChildren()
			throws UnsupportedMethodException {
		return children;
	}

	@Override
	public void setChildren(Collection<CompanyElement> children)
			throws UnsupportedMethodException {
		this.children = children;
	}

	// 重写抽象方法
	@Override
	public void work() {
		System.out.println(this.toString() + " 通知下属！");
		try {
			// 通知容器中的单位元素执行工作方法
			for (CompanyElement e : getChildren()) {
				e.work();
			}
		} catch (UnsupportedMethodException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public float getSalary() {
		// 初始化集合的薪水
		this.setSalary(0f);
		// 遍历元素将薪水相加
		for (CompanyElement e : children) {
			this.setSalary(super.getSalary() + e.getSalary());
		}
		// 返回加完后的薪水
		return super.getSalary();
	}

}
