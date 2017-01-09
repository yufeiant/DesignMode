package com.feiyu.factory_pattern;
/**
 * 除法运算类
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
			throw new Exception("被除数不能为空！");
		}
		result = number.getNumberA()/number.getNumberB();
		return result;
	}
}
