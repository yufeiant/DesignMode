package com.feiyu.strategy_pattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ���е����㣡");
		String operate = scanner.nextLine();
		System.out.println("�������һ�����֣�");
		double numberA = scanner.nextInt();
		System.out.println("������ڶ������֣�");
		double numberB = scanner.nextInt();
		
		Operation operation = OperationFactory.getOperation(operate);
		operation.setNumberA(numberA);
		operation.setNumberB(numberB);
		System.out.println("������Ϊ��"+operation.GetResult());
	}
}
