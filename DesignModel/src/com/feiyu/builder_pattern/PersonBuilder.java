package com.feiyu.builder_pattern;

import java.awt.Graphics;
import java.awt.Point;
/**
 * 抽象建造者的类，约束了必须要实现的函数
 * @author feiyu
 *
 */
public abstract class PersonBuilder {
	protected String g; //画布
	protected String p; //画笔
	
	public PersonBuilder(String g, String p) {
		super();
		this.g = g;
		this.p = p;
	}
	public abstract void BuildHead();
	public abstract void BuildBody();
	public abstract void BuildArmLeft();
	public abstract void BuildArmRight();
	public abstract void BuildLegLeft();
	public abstract void BuildLegRight();
	
}
