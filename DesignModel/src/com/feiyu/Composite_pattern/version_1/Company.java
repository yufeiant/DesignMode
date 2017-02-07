package com.feiyu.Composite_pattern.version_1;
/**
 * 公司抽象类
 * @author feiyu
 *
 */
public abstract class Company {
	protected String name;
	public Company(String name){
		this.name = name;
	}
	public abstract void Add(Company c);
	public abstract void Remove(Company c);
	public abstract void Display(int depth);
	public abstract void LineOfDuty();
	
}
