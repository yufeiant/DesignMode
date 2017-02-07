package com.feiyu.state_pattern;
/**
 * Context类，维护一个ConcreteState子类的实例，这个实例定义当前的状态
 * @author jfy
 *
 */
public class Context {
	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void Request(){
		state.Handle(this);
	}
}
