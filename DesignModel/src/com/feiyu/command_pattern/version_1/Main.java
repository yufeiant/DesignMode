package com.feiyu.command_pattern.version_1;
/**
 * 我们这里要进行一下命令模式的推导过程，在书中的例子中，都是从我们实际的生活中提炼出来的，
 * 在这个命令模式里，具体的例子是路边烧烤摊和它的进化版烧烤店。
 * 在路边烧烤摊中，由于只有一个老板进行烧烤，服务员和烧烤的人都是一个人，所以记菜单和烧烤
 * 都是老板一个人完成了。所以是紧耦合的实现。
 * 下面的进化版本请看version_2
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		BarBecuer boy = new BarBecuer();
		//烤五个串
		boy.BakeMutton();
		boy.BakeMutton();
		boy.BakeMutton();
		boy.BakeMutton();
		boy.BakeMutton();
		//烤两个鸡翅
		boy.BakeChickeWing();
		boy.BakeChickeWing();
	
		//这就是路边烧烤摊的实现，如果烤的人多了，这个要求放辣，那个要求不放辣，
		//提的要求多了，老板就忙不过来了
		
	}

}
