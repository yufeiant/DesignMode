package com.feiyu.state_pattern;
/**
 * 设置ConcreteStateA的下一个状态是ConcreteStateB
 * @author jfy
 *
 */
public class ConcreteStateA extends State {

	@Override
	public void Handle(Context context) {
		context.setState(new ConcreteStateB());
	}

}
