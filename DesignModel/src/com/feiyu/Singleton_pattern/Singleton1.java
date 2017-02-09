package com.feiyu.Singleton_pattern;
/**
 * 第一种：懒汉式，线程不安全
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * @author jfy
 *
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	//私有化构造函数，不让外界直接实例化
	private Singleton1(){
		
	}
	//该方法是获得本类实例的唯一全局访问点
	public static Singleton1 GetInstance(){
		//如果实例不存在，则返回一个新的实例，否则返回已经有的实例
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton1 obj1 = Singleton1.GetInstance();
		Singleton1 obj2 = Singleton1.GetInstance();
	    //输出结果：obj1==obj2?true
	    System.out.println("obj1==obj2?" + (obj1==obj2));
	}
}
