package com.feiyu.FactoryModel;

import java.util.Scanner;
/**
 * 简单工厂模式：
 * 在我以前的印象中，工厂模式一直以来都是重复的去创建对象，好吧，我错了，原来工厂模式是这样子的
 * 
 * 现在这个工厂模式实现的项目是实现一个计算器控制台程序，要求输入两个数和运算符号，得到计算结果。
 * 在传统的面向过程编程中，我们会直接在main方法中进行计算，通过switch判断语句进行运算符号的判断，
 * 然后具体的计算条件也会写死，比如'+','-','*','/',直接在界面上输出结果，这里就会几个问题
 * 一：界面和计算逻辑在一起，耦合高
 * 二：计算逻辑写死，可复用差
 * 三：如果想添加 一个开根方运算，需要进行所有计算类的编译，可扩展性差
 * 
 * 工厂模式的使用就是为了解决上面的问题，实现工厂模式的过程，更像是自己思考的过程，原来这样可以更好
 * 一：把计算类进行抽象出计算父类，Operation，所有的计算类都继承于此类，以后我们想添加别的运算类，
 * 只需要继承它
 * 二：每一个计算方式的不同，都继承Operation类去实现自己的实现，以后我们想修改加法类，只需要修改加
 * 法类的实现就可以了
 * 三：通过一个工厂类，通过传入的不同的运算符号，来判断需要实例化哪个类，需要哪个，我就给你实例化哪个，
 * 然后返回。
 * 
 *使用场景：在我们需要new很多对象时。可以考虑（简略版，以后进行补充）
 * http://baike.so.com/doc/6777948-6993946.html
 * @author feiyu
 *
 */
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
