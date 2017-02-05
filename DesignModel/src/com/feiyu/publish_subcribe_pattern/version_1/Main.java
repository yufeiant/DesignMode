package com.feiyu.publish_subcribe_pattern.version_1;
/**
 * 观察者模式-为了更好的学习这一款设计模式，我决定按照书上的代码一样，渐进式的把观察者模式
 * 推导出来
 * 实例场景：老板回来了，前台通知同事，老板回来了。
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		// version_1 虽然完美的描述了场景需求，但是却是双向耦合，按照依赖倒置原则，应该让
		//程序依赖抽象，而不是具体的实体，所以下一步，我们要把观察者抽象出来。
			//前台_董小姐
			Secretary dongxiaojie = new Secretary();
			//想要被通知的同事
			StockObserver a = new StockObserver("菲菲", dongxiaojie);
			StockObserver b = new StockObserver("飞飞", dongxiaojie);
			
			//前天记下要通知的同事
			dongxiaojie.Attach(a);
			dongxiaojie.Attach(b);
			
			//发现老板回来了
			dongxiaojie.setAction("老板回来了！！！");
			dongxiaojie.Notify();
			

	}

}
