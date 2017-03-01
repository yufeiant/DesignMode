package com.feiyu.command_pattern.version_3;

import java.util.ArrayList;
import java.util.List;

import com.feiyu.command_pattern.version_2.Command;

/**
 * 服务员类
 * @author feiyu
 */
public class Waiter {
	//增加存放具体命令的容器，也就是订单，
	private List<Command> orders = new ArrayList<>();
	//总共可以做多少烧烤
	private int command_count_all = 10;
	//已经做了多少
	private int command_count_current = 0;
	//设置订单
	public void setOrders(Command command){
		if(command_count_current>command_count_all){
			System.out.println("没有了，今天打样了");
		}else{
			orders.add(command);
		}
	}
	//取消订单 判断是不是已经做了
	public void CancelOrder(Command command){
		if (orders.contains(command)){
			orders.remove(command);
		}
	}
	//通知开始制作
	public void Notify(){
		for (Command command : orders) {
			command.ExcuteCommand();
		}
	}
}
