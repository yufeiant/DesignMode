package com.feiyu.strategy_pattern;

import java.io.Serializable;

public class NumberJavaBean implements Serializable{
	/**
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
