package com.feiyu.strategy_pattern;
/**
 * 计算类的抽象类
 * @author feiyu
 *
 */
public abstract class Operation {
	public NumberJavaBean number;
	public Operation(double numberA,double numberB) {
		number = new NumberJavaBean(numberA, numberB);
	}
	
	public Operation() {
		number = new NumberJavaBean();
	}
	public double getNumberA() {
		return number.getNumberA();
	}
	public void setNumberA(double numberA) {
		number.setNumberA(numberA);
	}
	public double getNumberB() {
		return number.getNumberB();
	}
	public void setNumberB(double numberB) {
		number.setNumberB(numberB);
	}

	abstract double GetResult() throws Exception;
	
	
}
