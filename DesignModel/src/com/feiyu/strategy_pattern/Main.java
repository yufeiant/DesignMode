package com.feiyu.strategy_pattern;
import com.feiyu.strategy_pattern.Context.type;
/**
 * 策略模式是定义了一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有
 * 的算法，减少了各种算法类于使用类之间的耦合。
 * 
 * 策略模式的Strategy接口为Context定义了一系列的可供重用的算法或行为，继承有助于折趣出这些算法中的公共功能。
 * 
 * 当不同的行为堆砌在一个类中时，就很难避免使用条件语句来选择合适的行为，将这些行为封装在一个个独立的Strategy类中，可以在使用
 * 这些行为的类中消除条件语句。
 * 
 * 策略模式就是用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，只要在分析过程中听到需要在不同的时间应用
 * 不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性。
 * 
 * 在基本的策略模式中，选择所用具体实现的职责由客户端对象承担，并转给策略模式的context对象，这本身并没有接触客户端需要选择判断
 * 的压力，而策略模式与简单工程模式结合后，选择具体实现的职责也可以由context来承担，这就最大化的减轻了客户端的职责。这样后，
 * 客户端只需要认识一个Context类，大大的减少了耦合。
 * 
 * @author jfy
 *
 */
public class Main {
	
	public static void main(String[] args) throws Exception {
		//根据传入不同的参数来获取不同的算法
		double money = 0;
		Context context  = new Context(type.reduce);
		money = context.getResult(200);
		System.out.println(money);
	}
}
