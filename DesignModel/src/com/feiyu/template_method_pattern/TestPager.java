package com.feiyu.template_method_pattern;
/**
 * 试卷的抽象类
 * @author feiyu
 *
 */
public abstract class TestPager {
	
	
	public void TestQuestion1(){
		System.out.println("1+1等于几？【】a.1 b.2 c.3 d.4");
		System.out.println("第一题："+Answer1());
	}
	
	public void TestQuestion2(){
		System.out.println("1+2等于几？【】a.1 b.2 c.3 d.4");
		System.out.println("第二题："+Answer2());
	}
	public void TestQuestion3(){
		System.out.println("1+3等于几？【】a.1 b.2 c.3 d.4");
		System.out.println("第三题："+Answer3());
	}
	public void TestQuestion4(){
		System.out.println("1+4等于几？【】a.1 b.2 c.3 d.5");
		System.out.println("第四题："+Answer4());
	}
	
	/**
	 * 定义抽象答题方法
	 */
	public abstract String Answer1();
	public abstract String Answer2();
	public abstract String Answer3();
	public abstract String Answer4();

	public void result(){
		TestQuestion1();
		TestQuestion2();
		TestQuestion3();
		TestQuestion4();

	}
	
}
