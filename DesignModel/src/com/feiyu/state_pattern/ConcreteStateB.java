package com.feiyu.state_pattern;
/**
 * 设置ConcreteStateB的下一个状态是ConcreteStateA
 * @author jfy
 */
public class ConcreteStateB extends State {

	@Override
	public void Handle(Context context) {
		context.setState(new ConcreteStateA());
	}
}
