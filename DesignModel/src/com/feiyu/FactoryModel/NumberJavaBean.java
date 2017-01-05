package com.feiyu.FactoryModel;

import java.io.Serializable;

public class NumberJavaBean implements Serializable{
	/**
	 * 数据类，定义了两个参数，用于传入两个值，在这个简单工厂模式中，
	 * 我们只进行简单的两个数的各种运算
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double numberA = 0;
	private double numberB = 0;
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	public NumberJavaBean(double numberA, double numberB) {
		super();
		this.numberA = numberA;
		this.numberB = numberB;
	}
	
	public NumberJavaBean() {
		
	}
	public String toString() {
		return "NumberJavaBean [numberA=" + numberA + ", numberB=" + numberB
				+ "]";
	}
	
}
