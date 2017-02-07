package com.feiyu.Composite_pattern.version_1;
/**
 * 财务部
 * @author feiyu
 */
public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
	}
	@Override
	public void Add(Company c) {
		//部门节点没有这两个方法
	}
	@Override
	public void Remove(Company c) {
		//部门节点没有这两个方法
	}
	@Override
	public void Display(int depth) {
		System.out.println(depth+"-"+name);
	}
	@Override
	public void LineOfDuty() {
		System.out.println(name+"公司财务收支管理");
	}

}
