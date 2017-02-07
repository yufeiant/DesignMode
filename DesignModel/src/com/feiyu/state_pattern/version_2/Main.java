package com.feiyu.state_pattern.version_2;

import com.feiyu.state_pattern.version_2.Work;
/**
 * 和第一个版本的客户端调用完全一样，不同的是，判断的进行实现在了内部，当不满足本类的运行条件时，就调用下一个类，然后调用运行，
 * 判断依次传递下去，直到判断完成，满足符合的条件
 * 如果我们要进行改动，添加一个员工必须在20点之前离开公司，我们就添加一个强制下班状态，并修改一下傍晚工作状态类的判断就可以了
 * @author jfy
 *
 */
public class Main {

	public static void main(String[] args) {
		Work emergencyProjects = new Work();
		emergencyProjects.setHour(9);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(10);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(12);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(13);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(14);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(17);
		emergencyProjects.setFinish(false);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(19);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(20);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(22);
		emergencyProjects.WriteProgram();

	}

}
