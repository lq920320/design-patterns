package com.composite;

import java.util.Collection;

/**
 * 组合模式的高层抽象
 * 
 * @author liuqian
 * 
 */
public abstract class CompanyElement {
	// 父容器
	private CompanyElement parent;
	// 个人名或部门名
	private String name;
	// 职位或部门工作类属
	private String job;
	// 工资，个人工资或部门工资和
	private float salary;

	public CompanyElement() {
	}

	public CompanyElement(CompanyElement parent, String name, String job,
			float salary) {
		super();
		this.parent = parent;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	// 获得父容器
	public CompanyElement getParent() {
		return parent;
	}

	// 设置父容器这里的原则是一个单一元素只能属于一个组合元素
	public void setParent(CompanyElement parent) {
		// 处理移除旧父容器
		// 注意此处为了保证对等性，在设置新的父容器时，必须移除以前的父容器
		if (getParent() != null && getParent() != parent) {
			try {
				if (getParent().getChildren().contains(this)) {
					getParent().remove(this);
				}
			} catch (UnsupportedMethodException e) {
				e.printStackTrace();
			}
		}

		// 处理设置父容器
		try {
			// 注意此处为了保证对等性，在设置父容器时，必须在容器中也加入此对象
			this.parent = parent;
			if (parent != null && !parent.getChildren().contains(this)) {
				parent.getChildren().add(this);
			}
		} catch (UnsupportedMethodException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	// 注意此方法是抽象方法
	public abstract void work();

	// 此方法抛出异常
	public void add(CompanyElement component) throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// 此方法抛出异常
	public void remove(CompanyElement component)
			throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// 此方法抛出异常
	public Collection<CompanyElement> getChildren()
			throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// 此方法抛出异常
	public void setChildren(Collection<CompanyElement> children)
			throws UnsupportedMethodException {
		throw new UnsupportedMethodException();
	}

	// 重写描述方法
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		// 使用递归的方式处理此元素的层次描述
		if (this.getParent() != null) {
			// 如果有父元素
			sb.append(this.getParent().toString() + " 的下属 ");
		} else {
			// 如果没有父容器不写入信息
		}
		sb.append(this.getName() + "[" + this.getJob() + "]");
		return sb.toString();
	}

}
