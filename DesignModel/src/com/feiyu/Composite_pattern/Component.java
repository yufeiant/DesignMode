package com.feiyu.Composite_pattern;

public abstract class Component {
	protected String name;
	public Component (String name){
		this.name = name;
	}
	public abstract void Add(Component c);
	public abstract void Remove(Component c);
	public abstract void Display(int depth);
}
