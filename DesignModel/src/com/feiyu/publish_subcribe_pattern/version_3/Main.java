package com.feiyu.publish_subcribe_pattern.version_3;
/**
 * 观察者模式-推导第三步，把通知者进行抽象，实现两边调用都依赖抽象
 * 
 * 
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		
			//前台_董小姐
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
