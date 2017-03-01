package com.feiyu.command_pattern.version_2;

import com.feiyu.command_pattern.version_1.BarBecuer;

/**
 * 抽象命令类，具体要考什么的动作抽象类，比如烤鸡翅，烤羊肉串，烤腰子，烤韭菜，烤...
 * 好吧，现在还不是夏天。它只需要知道操作它类事谁就可以，就是谁烤呢？
 * @author feiyu
 *
 */
public abstract class Command {
	protected BarBecuer receiver;
	public Command(BarBecuer receiver){
		this.receiver = receiver;
	}
	abstract public void ExcuteCommand();
}
