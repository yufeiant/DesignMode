package com.feiyu.Singleton_pattern;
/**
 * 第二种：懒汉式，线程安全
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。
 * @author jfy
 *
 */
public class Singleton2 {
	private static Singleton2 instance = null;
	//私有化构造函数，不让外界直接实例化
	private Singleton2(){
		
	}
	//该方法是获得本类实例的唯一全局访问点
	public static synchronized Singleton2 GetInstance(){
		//如果实例不存在，则返回一个新的实例，否则返回已经有的实例
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton2 obj1 = Singleton2.GetInstance();
		Singleton2 obj2 = Singleton2.GetInstance();
	    //输出结果：obj1==obj2?true
	    System.out.println("obj1==obj2?" + (obj1==obj2));
	}
}
