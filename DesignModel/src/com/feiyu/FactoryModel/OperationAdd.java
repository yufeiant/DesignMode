package com.feiyu.FactoryModel;
/**
 * 加法运算类，只是简单的加法运算
 * @author feiyu
 *
 */
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
