package com.feiyu.state_pattern.version_1;
/**
 * 工作状态
 * @author jfy
 *
 */
public class Work {
	private int hour;
	private boolean finish = false;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void WriteProgram(){
		if (hour<12){
			System.out.println("当前时间："+hour+"上午工作，精神百倍");
		}else if(hour<13){
			System.out.println("当前时间："+hour+"饿了，午饭：犯困，睡觉");
		}else if(hour <17){
			System.out.println("当前时间："+hour+"下午状态还不错，继续努力");
		}else{
			if (finish){
				System.out.println("当前时间："+hour+"下班回家了");
			}else{
				if(hour<21){
					System.out.println("当前时间："+hour+"加班中，好累");
				}else{
					System.out.println("当前时间："+hour+"要挂了，不行了，还在加班");
				}
			}
		}
	}
}
