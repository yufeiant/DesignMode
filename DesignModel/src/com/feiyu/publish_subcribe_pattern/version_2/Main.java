package com.feiyu.publish_subcribe_pattern.version_2;
/**
 * 观察者模式-推导第二步，把观察者进行抽象，解决了通知着通知观察者时的耦合
 * 
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		// version_2 我们把观察者抽象了出来，在前台通知同事的时候不在具体调用实体的函数
		//而是调用抽象的类，减少了耦合，但是我们这里还可以把通知着也进行抽象。
			//前台_董小姐
			Secretary dongxiaojie = new Secretary();
			//想要被通知的同事
			Observer a = new StockObserver("菲菲", dongxiaojie);
			Observer b = new StockObserver("飞飞", dongxiaojie);
			
			//前天记下要通知的同事
			dongxiaojie.Attach(a);
			dongxiaojie.Attach(b);
			
			//发现老板回来了
			dongxiaojie.setAction("老板回来了！！！");
			dongxiaojie.Notify();
			

	}

}
