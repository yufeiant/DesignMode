package com.feiyu.strategy_pattern;
/**
 * ����
 * @author feiyu
 *
 */
public class OperationDiv extends Operation {

	public OperationDiv(double numberA, double numberB) {
		super(numberA, numberB);
	}
	public OperationDiv() {
		super();
	}
	public double GetResult() throws Exception {
		double result = 0;
		if(number.getNumberB()==0){
			throw new Exception("��������Ϊ0");
		}
		result = number.getNumberA()/number.getNumberB();
		return result;
	}
}
