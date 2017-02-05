package com.feiyu.publish_subcribe_pattern.version_1;
/**
 * 同事
 * @author feiyu
 *
 */
public class StockObserver {
	private String name;
	private Secretary sub;
	public StockObserver(String name, Secretary sub) {
		super();
		this.name = name;
		this.sub = sub;
	}
	
	public void Update(){
		System.out.println(sub.getAction()+"关闭游戏网页，装作努力工作"+name);
	}
}
