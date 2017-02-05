package com.feiyu.publish_subcribe_pattern.version_3;

import com.feiyu.publish_subcribe_pattern.version_3.Subject;
/**
 * 看股票的同事
 * @author feiyu
 *
 */
public class StockObserver extends Observer {


	public StockObserver(String name,Subject sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Update() {
		System.out.println(sub.getAction()+name+"关闭股票行情，装作努力工作！");

	}

}
