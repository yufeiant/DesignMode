package com.feiyu.state_pattern.version_2;

public class SleepingState extends State {

	@Override
	public void Handle(Work work) {
		System.out.println("当前时间："+work.getHour()+"点，睡着了");
	}

}
