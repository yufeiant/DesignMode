package com.feiyu.state_pattern.version_2;



public class MustOutWorkState extends State {
	
	@Override
	public void Handle(Work work) {
		System.out.println("当前时间："+work.getHour()+"强制下班，赶紧给我滚蛋");
		work.setCurrent(new SleepingState());
		work.WriteProgram();
	}

}
