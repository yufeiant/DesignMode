package com.feiyu.strategy_pattern;

import java.util.Scanner;

import com.feiyu.strategy_pattern.Context.type;
import com.feiyu.strategy_pattern.algorithm.ConcreteStrategyA;
import com.feiyu.strategy_pattern.algorithm.ConcreteStrategyB;
import com.feiyu.strategy_pattern.algorithm.ConcreteStrategyC;
/**
 * 策略模式是定义了一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有
 * 的算法，减少了各种算法类于使用类之间的耦合。
 * 策略模式的Strategy接口为Context定义了一系列的可供重用的算法或行为，继承有助于折趣出这些算法中的公共功能。
 * @author jfy
 *
 */
public class Main {
	
	public static void main(String[] args) throws Exception {
		//根据传入不同的参数来获取不同的算法
		double money = 0;
		Context context  = new Context(type.reduce);
		money = context.getResult(200);
		System.out.println(money);
	}
}
