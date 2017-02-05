package com.feiyu.publish_subcribe_pattern.version_3;

import com.feiyu.publish_subcribe_pattern.version_3.Subject;
/**
 * 看NBA的同事
 * @author feiyu
 *
 */
public class NBAObserver extends Observer {

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
		
	}

	@Override
	public void Update() {
		System.out.println(sub.getAction()+name+"关闭NBA，装作努力工作！");

	}

}
