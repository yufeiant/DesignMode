package com.feiyu.publish_subcribe_pattern.version_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书类，负责监控老板，通知同事
 * @author feiyu
 *
 */
public class Secretary {
	//同事列表
	private List <StockObserver> observers = new ArrayList<StockObserver>();
	private String action;
	
	//添加需要通知的同事
	public void Attach(StockObserver observer){
		observers.add(observer);
	}
	
	//通知
	public void Notify(){
		for (StockObserver observer : observers) {
			observer.Update();
		}
	}
	//前台状态
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
}
