package com.feiyu.memento;
/**
 * 发起人 -负责创建一个备忘录Memento，用以记录当前时刻的内部状态，并可以使用备忘录恢复内部
 * 状态，Originator可根据需要决定Memento存储Originator的哪些内部状态。
 * @author feiyu
 *
 */
public class Originator {
	//需要保存的属性，可能有多个
	private String state;
	private String name;
	private int age;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象
	 * @return
	 */
	public Memento CreateMemento(){
		return new Memento(state,name,age);
	}
	public void setMemento(Memento memento){
		this.state = memento.getState();
		this.name = memento.getName();
		this.age = memento.getAge();
		
	}
	@Override
	public String toString() {
		return "Originator [state=" + state + ", name=" + name + ", age=" + age
				+ "]";
	}
	public void show(){
		System.out.println(toString());
	}
}
