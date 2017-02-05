package com.feiyu.publish_subcribe_pattern.version_2;

import com.feiyu.publish_subcribe_pattern.version_2.Secretary;
/**
 * 看NBA的同事
 * @author feiyu
 *
 */
public class NBAObserver extends Observer {

	public NBAObserver(String name, Secretary sub) {
		super(name, sub);
		
	}

	@Override
	public void Update() {
		System.out.println(sub.getAction()+name+"关闭NBA，装作努力工作！");

	}

}
