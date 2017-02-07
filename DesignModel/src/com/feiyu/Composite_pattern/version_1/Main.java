package com.feiyu.Composite_pattern.version_1;
/**
 * 组合模式的好处：
 * 这样就定义了包含人力资源部和财务部这些基本对象和分公司，办事处灯组合对象的类层次结构，
 * 基本对象可以被组合成更复杂的组合对象，而组合对象又可以继续被组合下去，这样不断地递归下去
 * ，客户代码中，任何用到基本对象的地方都可以用组合对象。
 * 
 * 组合模式让客户可以一致地使用组合结构和单个对象。
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京胖子科技总公司");
		root.Add(new FinanceDepartment("总公司人力资源部"));
		root.Add(new HRDepartment("总公司财务部"));
		
		ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
		comp.Add(new FinanceDepartment("上海华东人力资源部"));
		comp.Add(new HRDepartment("上海华东财务部"));
		root.Add(comp);
		
		ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
		comp1.Add(new FinanceDepartment("南京办事处人力资源部"));
		comp1.Add(new HRDepartment("南京办事处财务部"));
		root.Add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
		comp2.Add(new FinanceDepartment("杭州办事处人力资源部"));
		comp2.Add(new HRDepartment("杭州办事处财务部"));
		root.Add(comp2);
		
		System.out.println("\n 结构图");
		root.Display(1);

		System.out.println("\n 职责");
		root.LineOfDuty();

	}

}
