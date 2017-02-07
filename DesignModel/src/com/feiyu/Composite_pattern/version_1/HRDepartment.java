package com.feiyu.Composite_pattern.version_1;
/**
 * 人力资源部
 * @author feiyu
 */
public class HRDepartment extends Company {

	public HRDepartment(String name) {
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
		System.out.println(name+"员工招聘培训制度管理");
	}

}
