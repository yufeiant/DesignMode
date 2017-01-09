package com.feiyu.strategy_pattern;

import com.feiyu.strategy_pattern.algorithm.ConcreteStrategyA;
import com.feiyu.strategy_pattern.algorithm.ConcreteStrategyB;
import com.feiyu.strategy_pattern.algorithm.ConcreteStrategyC;
import com.feiyu.strategy_pattern.algorithm.Strategy;
/**
 * 客户端类，保留有一个strtegy的引用，根据不同的对象来调用各自的实现方法
 * 
 * @author jfy
 *
 */
public class Context {
	enum type{
		normal,reduce,discount
	}
		
	private Strategy strategy = null;
	
	public Context(type types) {
		switch (types) {
		case normal:
			strategy = new ConcreteStrategyA();
			break;
		case reduce:
			strategy = new ConcreteStrategyB();		
			break;
		case discount:
			strategy = new ConcreteStrategyC();
			break;
		
		default:
			break;
		}
	}
	
	public double getResult(double money){
		return strategy.AlgorithmInterface(money);
	}
	
}
