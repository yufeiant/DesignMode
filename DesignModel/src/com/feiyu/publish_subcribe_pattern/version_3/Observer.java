package com.feiyu.publish_subcribe_pattern.version_3;

import com.feiyu.publish_subcribe_pattern.version_3.Subject;

/**
 * 抽象观察者
 * @author feiyu
 *
 */
public abstract class Observer {
	protected String name;
	protected Subject sub;
	public Observer(String name, Subject sub) {
		super();
		this.name = name;
		this.sub = sub;
	}
	
	public abstract void Update();
}
