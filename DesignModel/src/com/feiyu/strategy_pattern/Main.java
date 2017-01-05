package com.feiyu.strategy_pattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要进行的运算！");
		String operate = scanner.nextLine();
		System.out.println("请输入第一个数字！");
		double numberA = scanner.nextInt();
		System.out.println("请输入第二个数字！");
		double numberB = scanner.nextInt();
		
		Operation operation = OperationFactory.getOperation(operate);
		operation.setNumberA(numberA);
		operation.setNumberB(numberB);
		System.out.println("运算结果为："+operation.GetResult());
	}
}
