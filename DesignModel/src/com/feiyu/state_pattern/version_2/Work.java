package com.feiyu.state_pattern.version_2;

public class Work {
	
	private State current;
	private double hour;
	private boolean finish = false;
	
	public Work() {
		
		this.current = new MorningState();
	}

	public State getCurrent() {
		return current;
	}

	public void setCurrent(State current) {
		this.current = current;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void WriteProgram(){
		current.Handle(this);
	}
}
