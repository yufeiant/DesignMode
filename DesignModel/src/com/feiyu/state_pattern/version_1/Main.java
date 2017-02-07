package com.feiyu.state_pattern.version_1;
/**
 * 不适用状态模式时，Work类中有又臭又长的条件判断，而且一旦想修改其中的一些代码就会对整体的代码造成影响
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
		emergencyProjects.setFinish(true);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(19);
		emergencyProjects.WriteProgram();
		emergencyProjects.setHour(22);
		emergencyProjects.WriteProgram();

	}

}
