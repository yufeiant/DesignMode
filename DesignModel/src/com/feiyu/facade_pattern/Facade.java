package com.feiyu.facade_pattern;
/**
 * 外观模式的核心类，把这些琐碎的事交给专业的类来管理
 * @author jfy
 *
 */
public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	public void MethodA(){
		System.out.println("方法组A");
		one.MethodOne();
		two.MethodTwo();
		three.MethodThree();
	}
	
	public void MethodB(){
		System.out.println("方法组B");
		one.MethodOne();
		two.MethodTwo();
		four.MethodFour();
	}
}
