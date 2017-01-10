package com.feiyu.decorative_pattern;

import com.feiyu.decorative_pattern.decorative.ConcreteDecoratorsA;
import com.feiyu.decorative_pattern.decorative.ConcreteDecoratorsB;

/**
 * 装饰模式，动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 * 
 * 装饰模式就是利用SetComponent来对对象进行封装的，这样每个装饰对象的实现和如何使用这个
 * 对象就分离开了，每个装饰对象只关心自己的功能，不需要关心如何添加到对象链当中[DPE]
 * 
 * 流程描述：
 * 装饰模式是为已有功能的对象动态的添加另外的功能，核心是装饰对象和操作对象它们有共同的接口
 * 在这个项目里，ConcreteComonent和ConcreteDecoratorsA都实现了接口Component,ConcreteDecoratorsA
 * 对象通过继承Decorator来实现的Component接口，而在抽象类Decorator中持有了Component它的饮用，然后调用
 * Component中的Operation方法，我们在操作装饰对象对原有对象动态添加额外功能时，是通过SetComponent来对
 * 操作对象进行封装，d1.SetComponent（con）,当我们调用d1.Operation();时，Operation方法是继承至Decorator,
 * super.Operation();调用Decorator中的方法，而Decorator中的component已经通过SetComponent设置了进去，
 * 所以，先执行的是ConcreteComonent的方法，接着走ConcreteDecoratorsA补充的方法。
 * 
 * 官方描述：
 * 装饰模式是为已有功能动态添加更多功能的一种方式。
 * 
 * 当系统需要更新功能的时候，是向旧的类中添加新的代码，这些新添加的代码通常装饰了原有类的
 * 核心职责或主要行为，这样的操作的问题在于，它们在类中加入了新的字段，新的方法，和新的逻辑，
 * 从而增加了主类的复杂度，而这些新加入的东西仅仅是为了满足一些在某种特定情况下才会执行的
 * 特殊行为的需要，而装饰模式却提供了一个非常好的解决方案，它把每个要装饰的功能放在单独的类中，
 * 并让这个包装它所要装饰的对象，因此，当需要执行特殊行为时，客户代码就可以在运行时根据需要
 * 有选择地，按顺序地使用装饰功能来包装对象。
 * 
 * 优点：把类中的装饰功能从类中搬除出去，这样可以简化原有的类。这样做的好处就是有效的把类的
 * 核心职责和装饰功能区分开了，并且可以去除相关类中重复的装饰逻辑。
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		ConcreteComonent con = new ConcreteComonent();
		ConcreteDecoratorsA d1 = new ConcreteDecoratorsA();
		ConcreteDecoratorsB d2 = new ConcreteDecoratorsB();
		
		d1.SetComponent(con);
		d1.Operation();
		d2.SetComponent(d1);
		d2.Operation();
		
		System.out.println("结束");
	}

}
