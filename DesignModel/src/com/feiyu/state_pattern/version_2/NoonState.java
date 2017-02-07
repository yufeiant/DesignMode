package com.feiyu.state_pattern.version_2;

public class NoonState extends State {

	@Override
	public void Handle(Work work) {
		if(work.getHour()<13){
			System.out.println("当前时间："+work.getHour()+"饿了，午饭：犯困，睡觉");
		}else{
			work.setCurrent(new AfternoonState());
			work.WriteProgram();
		}

	}

}
