package com.feiyu.command_pattern.version_2;
/**
 * 服务员类
 * @author feiyu
 *
 */
public class Waiter {
	private Command command;
	
	//设置订单
	public void SetOrder(Command command){
		this.command = command;
	}
	
	//通知执行--服务员都不知道谁执行，只需要调用命令里的方法就可以了
	public void Notify(){
		command.ExcuteCommand();
	}
}
