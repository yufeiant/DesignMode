package com.feiyu.publish_subcribe_pattern.version_3;


import java.util.ArrayList;
import java.util.List;


/**
 * 通知者，老板回来了
 * @author feiyu
 *
 */
public class Secretary implements Subject {
	
	private String action;
	private List<Observer> observers = new ArrayList<Observer>(); 
	
	@Override
	public void Attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void Detach(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void Notify() {
		for (Observer observer : observers) {
			observer.Update();
		}
	}

	@Override
	public String getAction() {
		return action;
	}
	
	@Override
	public void setAction(String action) {
		
		this.action = action;
	}

	

}
