package com.feiyu.FactoryModel;
/**
 * �˷�
 * @author feiyu
 *
 */
public class OperationMul extends Operation {

	public OperationMul(double numberA, double numberB) {
		super(numberA, numberB);
		
	}
	public OperationMul() {
		super();
	}
	public double GetResult() {
		
		return number.getNumberA()*number.getNumberB();
	}

}
