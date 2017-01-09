package com.feiyu.strategy_pattern.algorithm;

public class ConcreteStrategyA implements Strategy {

	@Override
	public double AlgorithmInterface(double money) {
		System.out.println("正常交易："+money);
		return money;
	}

}
