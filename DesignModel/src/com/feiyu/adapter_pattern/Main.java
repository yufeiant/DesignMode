package com.feiyu.adapter_pattern;
/**
 * 适配器模式--将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的哪些类可以一起工作。
 * 
 * 使用场景：软件的开发后期或者维护期，在双方都不太容易修改的时候在使用适配器模式适配。
 * 在使用一个已经存在的类时，如果它的接口，也就是它的方法和你的要求不相同时，就可以考试使用适配器模式。
 * 两个类所做的事情相同或相似，但是具有不同的接口时，就使用它，这样客户端代码可以统一调用统一个接口就可以，更简单，更直接，更紧凑。
 * 
 * 场景：姚明刚刚到NBA时不会英语，需要翻译，而教练在布置任务
 * 
 * 可以直接调用翻译者的进攻和防守，进而调用姚明的进攻和防守
 * 
 * 
 * 这个模式不要乱用,当程序设计初期出现接口不同问题的时候，应该去重构设计，使接口相同，而不是使用适配器模式
 * 
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		Player b = new Forwards("巴蒂尔");
		Player m = new Guards("麦克格莱迪");
		Player c = new Center("巴特尔");
		Player ym = new Translator("姚明");
		b.Attack();
		m.Attack();
		c.Defense();
		ym.Attack();
		ym.Defense();
	}
}
