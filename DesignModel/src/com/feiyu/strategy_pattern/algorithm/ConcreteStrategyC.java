package com.feiyu.strategy_pattern.algorithm;

public class ConcreteStrategyC implements Strategy {
/**
 * 满200打八折
 */
	@Override
	public double AlgorithmInterface(double money) {
		System.out.println("满200打八折");
		if (money>=200){
			return money*0.8;
		}
		return money;
	}

}
