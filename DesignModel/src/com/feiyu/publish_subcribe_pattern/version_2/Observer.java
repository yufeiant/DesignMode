package com.feiyu.publish_subcribe_pattern.version_2;

import com.feiyu.publish_subcribe_pattern.version_2.Secretary;

/**
 * 抽象观察者
 * @author feiyu
 *
 */
public abstract class Observer {
	protected String name;
	protected Secretary sub;
	public Observer(String name, Secretary sub) {
		super();
		this.name = name;
		this.sub = sub;
	}
	
	public abstract void Update();
}
