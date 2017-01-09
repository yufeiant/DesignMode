package com.feiyu.decorative_pattern.decorative;

public class ConcreteDecoratorsB extends Decorator {
	
	
	/**
	 * 首先执行父类的操作，super.Operation(),再执行本类的操作，如addedState,
	 * 相当于对原Component进行了装饰
	 */
	@Override
	public void Operation() {
		
		super.Operation();
		AddBehavior();
		System.out.println("具体装饰对象B的操作");
	}
	
	//本类的独有功能，以区别于ConcreteDecoratorsA
	private void AddBehavior(){
		
	}
}
