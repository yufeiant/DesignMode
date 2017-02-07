package com.feiyu.memento_pattern;
/**
 * 管理者，管理备忘录
 * @author feiyu
 *
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
