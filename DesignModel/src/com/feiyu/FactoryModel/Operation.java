package com.feiyu.FactoryModel;
/**
 * 计算类的抽象类，在这里把数据类进行了分装，在后面的子类中不需要在进行数据类的初始化，
 * 只需要传入值就可以了
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
	//获取计算结果	
	abstract double GetResult() throws Exception;
	
	
}