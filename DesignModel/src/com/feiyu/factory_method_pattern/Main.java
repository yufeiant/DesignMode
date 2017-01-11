package com.feiyu.factory_method_pattern;

import com.feiyu.factory_pattern.Operation;

/**
 * 工厂方法模式
 * 我们既然有了简单工厂模式，为什么还要使用工厂方法模式呢？
 * 首先说一下简单工厂模式的优点：
 * 简单工厂模式的最大有点在于工厂类包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端
 * 来说，去除了于具体产品的依赖。
 * 当我们要添加一个新的运算类时，必须要需改工厂类的case来添加新的工厂判断，这个就违背了开放封闭原则。
 * （开放封闭原则：软件实体（类，模块，函数等等）应该可以扩展，但是不可修改。）
 * 这个时候就需要我们的工厂方法模式了出场了：
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到起子类。
 * 
 * 既然工厂模式中工厂类的条件判断是一个需要经常变化的地方，所以我们就要对它动刀了，首先抽取出工厂方法的创建
 * 接口，然后让其子类实现，在子类的实现中进行实例化，不过这样的话，条件的判断就又回到了客户端那里，在后面我
 * 们会反射来解决。消灭条件判断。
 * 
 * 
 * 
 * @author jfy
 */
public class Main {

	public static void main(String[] args) throws Exception {
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.CreateOperation();
		oper.setNumberA(100);
		oper.setNumberB(200);
		oper.GetResult();
	}

}
