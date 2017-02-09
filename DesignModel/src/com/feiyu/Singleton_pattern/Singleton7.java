package com.feiyu.Singleton_pattern;
/**
 * 第七种：双重校验锁
 * 为什么要使用双重校验呢，我们假定，如果有两个线程同时进来获取实例，他们同时都进入了if(instance==null)这里，然后一个进程先进入了同步模块，然后它创建了
 * 一个实例，第二个线程后进入，如果没有判断的话，那么它就会又创建一个实例，所以又添加了一个判断是否为空的情况。
 * @author jfy
 *
 */
public class Singleton7 {
	private static Singleton7 instance = null;
	private Singleton7(){}
	
	public static Singleton7 GetInstance(){
		if(instance == null){
			synchronized (Singleton7.class) {
				if(instance==null){
					instance = new Singleton7();
				}
			}
		}
		return instance;
	}
}
