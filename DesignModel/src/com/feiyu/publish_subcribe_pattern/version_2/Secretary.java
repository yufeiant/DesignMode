package com.feiyu.publish_subcribe_pattern.version_2;

import java.util.ArrayList;
import java.util.List;

import com.feiyu.publish_subcribe_pattern.version_1.StockObserver;

/**
 * 前台秘书类
 * @author feiyu
 *
 */
public class Secretary {
	//同事列表
		private List <Observer> observers = new ArrayList<Observer>();
		private String action;
		
		//添加需要通知的同事 --这里的具体添加改为添加父类而不是子类，减少了耦合
		public void Attach(Observer observer){
			observers.add(observer);
		}
		
		//通知---这里的调用直接调用抽象类的函数而不是实体的，减少了耦合
		public void Notify(){
			for (Observer observer : observers) {
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
