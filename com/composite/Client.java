package com.composite;
/**
 * 超市组织结构客户端
 * @author liuqian
 *
 */
public class Client {

	public static void main(String[] args) {
		//实例化超市组织的对象
		CompanyElement root = new Department(
				null, "超市团队", "", 0f);
		CompanyElement saleDept = new Department(
				root, "销售部", "销售", 0f);
		CompanyElement saleDept_1 = new Department(
				saleDept, "销售团队甲", "销售", 0f);
		CompanyElement financialDept = new Department(
				root, "财务部", "后勤", 0f);
		
		CompanyElement ceo = new Person(
				root, "岳不群", "CEO", 10000f);
		CompanyElement cfo = new Person(
				root, "宁中则", "CFO", 8000f);
		CompanyElement saler_1 = new Person(
				saleDept, "令狐冲", "销售人员", 3000f);
		CompanyElement saler_2 = new Person(
				saleDept_1, "陆大有", "销售人员", 2000f);
		CompanyElement financial_1 = new Person(
				financialDept, "岳灵珊", "财务人员", 2000f);
		
		System.out.println("测试根：");
		root.work();
		System.out.println("测试组合对象：");
		saleDept.work();
		System.out.println("测试单个对象：");
		saler_2.work();
		
		System.out.println(root.getName() + "的工资是："
				+ root.getSalary());
		System.out.println(cfo.getName() + "的工资是："
				+ cfo.getSalary());
	}
}
