package com.feiyu.Singleton_pattern;

/**
 * 第四种：饿汉式 -- 变种
 * 表面上看起来差别挺大，其实更第三种方式差不多，都是在类初始化即实例化instance。
 * @author jfy
 *
 */
public class Singleton4 {
	private static  Singleton4 instance = null;
	//静态代码块
	static{
		instance = new Singleton4();
	}
	private Singleton4(){}
	
	public static Singleton4 GetInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton4 obj1 = Singleton4.GetInstance();
		Singleton4 obj2 = Singleton4.GetInstance();
	    //输出结果：obj1==obj2?true
	    System.out.println("obj1==obj2?" + (obj1==obj2));
	}
}