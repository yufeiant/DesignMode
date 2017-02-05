package com.feiyu.publish_subcribe_pattern.version_4;

import com.feiyu.publish_subcribe_pattern.version_3.Subject;
/**
 * 看NBA的同事
 * @author feiyu
 *
 */
public class NBAObserver  {
	private String name;
	public NBAObserver(String name) {
		this.name = name;
	}

	
	public void CloseNBA(String action) {
		System.out.println(action+name+"关闭NBA，装作努力工作！");

	}

}
