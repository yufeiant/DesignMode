package com.feiyu.command_pattern;
/**
 * Invoker类，要求命令执行这个请求
 * @author feiyu
 *
 */
public class Invoker {
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void ExcecuteCommand(){
		command.Execute();
	}
}
