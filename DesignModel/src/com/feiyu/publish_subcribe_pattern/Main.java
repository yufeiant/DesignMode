package com.feiyu.publish_subcribe_pattern;

import com.feiyu.publish_subcribe_pattern.version_3.Secretary;
import com.feiyu.publish_subcribe_pattern.version_3.StockObserver;
import com.feiyu.publish_subcribe_pattern.version_3.Observer;
import com.feiyu.publish_subcribe_pattern.version_3.Subject;

/**
 * 大名鼎鼎的观察者模式：
 * 观察者模式：定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题
 * 对象在状态发生改变时，会通知所有观察者对象，使它们能够自动的更新自己。
 * 
 * 
 * 
 * @author feiyu
 * 
 */
public class Main {
	public static void main(String[] args) {
		//这里和version3中的Main.java相同
		Subject dongxiaojie = new Secretary();
		//想要被通知的同事
		Observer a = new StockObserver("菲菲", dongxiaojie);
		Observer b = new StockObserver("飞飞", dongxiaojie);
		
		//前天记下要通知的同事--在这里的添加和通知，都是调用的抽象的函数，
		//实现了松耦合--依赖倒置原则
		dongxiaojie.Attach(a);
		dongxiaojie.Attach(b);
		
		//发现老板回来了
		dongxiaojie.setAction("老板回来了！！！");
		dongxiaojie.Notify();
	}

}
