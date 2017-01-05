package com.feiyu.strategy_pattern;

public class OperationAdd extends Operation {

	public OperationAdd(double numberA, double numberB) {
		super(numberA, numberB);
		
	}

	public double GetResult() {
		
		return number.getNumberA()+number.getNumberB();
	}
	public OperationAdd() {
		super();
	}
}
