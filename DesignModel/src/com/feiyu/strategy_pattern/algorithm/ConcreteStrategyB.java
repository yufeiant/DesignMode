package com.feiyu.strategy_pattern.algorithm;

public class ConcreteStrategyB implements Strategy {
/**
 * 满200减10块
 */
	@Override
	public double AlgorithmInterface(double money) {
		if(money>=200){
			System.out.println("满200减10块");
			return money -10;
		}
		return money;
	}

}
