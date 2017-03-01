package com.feiyu.chain_of_responsibility_pattern;
/**
 * 责任链模式：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系，
 * 将对象链成一条链，并沿着这条链传递请求，直到有一个对象处理它为止。
 * 
 * 这个模式让我想起来了状态模式，同样是可以用来消灭判断条件的模式。那我们这里复习一下状态模式好了
 * 
 *	状态模式(State)--当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 * 官方定义的含义虽然精辟，但总数不那么友好，不便于理解。我们只要知道状态模式是用来解决什么问题场景的，就知道该怎么使用它了。
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过去复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类当中，
 * 可以把复杂的判断逻辑简化。
 * 
 * 
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
