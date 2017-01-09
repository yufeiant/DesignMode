package com.feiyu.factory_pattern;

public class OperationStub extends Operation {

	public OperationStub(double numberA, double numberB) {
		super(numberA, numberB);
		
	}
	public OperationStub() {
		super();
	}
	public double GetResult() {
		
		return number.getNumberA()-number.getNumberB();
	}

}
