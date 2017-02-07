package com.feiyu.state_pattern.version_2;

public class MorningState extends State {

	@Override
	public void Handle(Work work) {
		if(work.getHour()<12){
			System.out.println("当前时间："+work.getHour()+"上午工作，精神百倍");
		}else{
			work.setCurrent(new NoonState());//消灭判断是把这种判断的操作传递了下去
			work.WriteProgram();
		}
	}

}
