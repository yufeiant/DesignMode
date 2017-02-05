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
 * 观察者模式的动机：
 * 将一个系统分割成一系列相互协作的类有一个很不好的副作用，那就是需要维护相关对象间的一致性，
 * 我们不希望为了维护一致性而是各类紧密耦合，这样给给维护，扩展和重用都带来了不编。
 * 而观察者模式的关键对象时主题Subject和观察者Observer，一个Subject可以任意数目的依赖它的
 * Observer,一旦Subject的状态发生了改变，所有的Observer都会得到通知，Subject在发出通知时
 * 并不需要知道它是谁的观察者，也就是说，具体的观察者是谁，他根本不需要知道，而任何一个
 * 具体的观察者也不需要知道其他观察者的存在。
 * 
 * 应该什么时候用呢？
 * 当一个对象的改变需要同时改变其他的对象时，而且它不知道具体有多少对象需要改变时，考虑
 * 使用观察者模式。
 * 
 * 一个抽象模型有两个方面，其中一个方面依赖与另一个方面，这时用观察者模式可以将这两者封装在
 * 独立的对象中使它们各自独立的改变和复用。
 * 
 * 观察者模式所做的工作就是解除耦合，使耦合的双方都依赖与抽象，而不是依赖于具体的，从而使得
 * 各自的变化都不会影响另一边的变化。
 * 
 * 在现实的情况中，观察者可能是分马牛不相及的，所以抽象观察者应该使用接口而不是抽象类
 * 
 * 抽象通知者耦合抽象观察者，如果没有抽象观察者，则抽象通知者就不知道该怎么通知了，在抽象
 * 观察者这里，具体的观察实现了共同的接口，可是如果他们要实现完全不同的操作呢，他们有自己具体的
 * 调用实现呢，这里就引出了观察者模式的不足：
 * 1：抽象通知者还是依赖了抽象观察者，当没有观察者的时候，没办法更新
 *:2：要求观察者的所有动作 必须一样 ，如果不一样的话，不能实现
 *
 * 解决办法就是事件委托模式：version_4
 * 事件委托就是我把我要调用的方法传给你，由你来调用，而不用知道对象时谁
 * 
 * 实例场景：老板回来了，前台通知同事，老板回来了。
 * 
 * 第一步：实现通知 version_1
 * 第二步：抽象观察者 version_2
 * 第三部：抽象通知者 version_3
 * 第四部：观察者模式的不足和委托模式 version_4
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
