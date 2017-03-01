package com.feiyu.command_pattern.version_2;

import com.feiyu.command_pattern.version_1.BarBecuer;
/**
 * 烤鸡翅类
 * @author feiyu
 *
 */
public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(BarBecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExcuteCommand() {
		receiver.BakeChickeWing();

	}

}
