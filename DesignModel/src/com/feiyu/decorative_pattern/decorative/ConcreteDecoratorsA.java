package com.feiyu.decorative_pattern.decorative;

public class ConcreteDecoratorsA extends Decorator {
	//本类的独有功能，以区别于ConcreteDecoratorsB
	private String addedState;
	/**
	 * 首先执行父类的操作，super.Operation(),再执行本类的操作，如addedState,
	 * 相当于对原Component进行了装饰
	 */
	@Override
	public void Operation() {
		
		super.Operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作");
		
	}
}
