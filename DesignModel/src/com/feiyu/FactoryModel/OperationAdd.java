package com.feiyu.FactoryModel;
/**
 * �ӷ������ֻ࣬�Ǽ򵥵ļӷ�����
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
