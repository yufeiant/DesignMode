package com.feiyu.state_pattern;
/**
 * 状态模式(State)--当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 * 官方定义的含义虽然精辟，但总数不那么友好，不便于理解。我们只要知道状态模式是用来解决什么问题场景的，就知道该怎么使用它了。
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过去复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类当中，
 * 可以把复杂的判断逻辑简化。
 * 当然，如果状态判断很简单时，我们就没有必要用状态模式了。
 * 
 * 面向对象的设计其实就是希望做到代码的责任分解，也就是单一职责原则。
 * 
 * 状态模式的好处就是将于特定状态相关的行为局部化，并且将不同状态的行为分割开来。
 * 
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		c.Request();
		c.Request();
		c.Request();
		c.Request();

	}

}
