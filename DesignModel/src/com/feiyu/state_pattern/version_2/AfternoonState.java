package com.feiyu.state_pattern.version_2;

public class AfternoonState extends State {

	@Override
	public void Handle(Work work) {
		if(work.getHour()<17){
			System.out.println("当前时间："+work.getHour()+"下午状态还不错，继续努力");
		}else{
			work.setCurrent(new EveningState());
			work.WriteProgram();
		}

	}

}
