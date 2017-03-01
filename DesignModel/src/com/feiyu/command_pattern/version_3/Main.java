package com.feiyu.command_pattern.version_3;

import com.feiyu.command_pattern.version_1.BarBecuer;
import com.feiyu.command_pattern.version_2.BakeChickenWingCommand;
import com.feiyu.command_pattern.version_2.BakeMuttonCommand;
import com.feiyu.command_pattern.version_3.Waiter;

/**
 * 松耦合
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
		w.setOrders(c);
		w.setOrders(m);
		w.setOrders(m);
		w.setOrders(m);
		w.setOrders(m);
		w.Notify();
		w.setOrders(m);
		w.setOrders(c);
		w.setOrders(c);
		w.Notify();
		w.setOrders(c);
		w.setOrders(c);
		w.Notify();

	}
}
