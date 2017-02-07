package com.feiyu.state_pattern.version_2;

public class EveningState extends State {

	@Override
	public void Handle(Work work) {
		double hour = work.getHour();
		if(work.isFinish()){
			work.setCurrent(new RestState());
			work.WriteProgram();
		}else{
//			if (hour<21){
//				System.out.println("当前时间："+hour+"加班中，好累");
//			}else{
//				work.setCurrent(new SleepingState());
//				work.WriteProgram();
//			}
		if (hour<20){
			System.out.println("当前时间："+hour+"加班中，好累");
		}else{//强制下班
			work.setCurrent(new MustOutWorkState());
			work.WriteProgram();
		}
		}
	}

}
