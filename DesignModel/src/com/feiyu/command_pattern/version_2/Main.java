package com.feiyu.command_pattern.version_2;

import com.feiyu.command_pattern.version_1.BarBecuer;

/**
 * 这里对应的就是烧烤店的实现。
 * 
 * 我们这里基本的代码实现了，但是还是有很多的问题：
 * 1):真实的情况不应该是客户点一个菜，服务员就通知做一个,而是全部点完后，服务员一次通知
 * 2):如果此时鸡翅没了，不应该是客户来判断是否存在，而是服务员或者烤肉串的人来判断
 * 3):客户点了很多菜却没有记下来啊，怎么算钱
 * 4):万一点多了想退怎么办？
 * 
 * 请看第三版version_3
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		//准备厨师
		BarBecuer boy = new BarBecuer();
		//准备烤肉订单
		BakeChickenWingCommand c = new BakeChickenWingCommand(boy);
		BakeMuttonCommand m = new BakeMuttonCommand(boy);
		//服务员开始设置订单，并通知厨房开始烧烤
		Waiter w = new Waiter();
		w.SetOrder(c);
		w.Notify();
		w.SetOrder(m);
		w.Notify();
		w.SetOrder(c);
		w.Notify();

	}

}
