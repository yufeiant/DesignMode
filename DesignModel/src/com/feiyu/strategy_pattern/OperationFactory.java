package com.feiyu.strategy_pattern;

public class OperationFactory {
	public static Operation getOperation(String operate) throws Exception{
		Operation operation = null;
		switch (operate) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationStub();		
			break;
		case "*":
			operation = new OperationMul();
			break;
		case "/":
			operation = new OperationDiv();
			break;
		
		default:
				throw new Exception("��û��ʵ��������㷨����Ǹ������");
		}
		return operation;
		
	}
}
