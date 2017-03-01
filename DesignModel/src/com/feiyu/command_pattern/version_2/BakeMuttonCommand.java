package com.feiyu.command_pattern.version_2;


import com.feiyu.command_pattern.version_1.BarBecuer;
/**
 * 烤羊肉串类
 * @author feiyu
 *
 */
public class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(BarBecuer receiver) {
		super(receiver);
	}
	@Override
	public void ExcuteCommand() {
		//这里调用烤羊肉串的人进行烤羊肉串
		receiver.BakeMutton();
	}
}
