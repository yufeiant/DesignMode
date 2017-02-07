package com.feiyu.memento;
/**
 * 备忘录-负责存储Originator对象的内部状态
 * @author feiyu
 *
 */
public class Memento {
	private String state;
	private String name;
	private int age;
	
	public String getState() {
		return state;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Memento(String state, String name, int age) {
		super();
		this.state = state;
		this.name = name;
		this.age = age;
	}
	
}
