package com.feiyu.publish_subcribe_pattern.version_4;

/**
 * 看股票的同事
 * @author feiyu
 *
 */
public class StockObserver  {
	private String name;
	public StockObserver(String name) {
		this.name = name;
	}

	public void CloseStock(String action) {
		System.out.println(action+name+"关闭股票行情，装作努力工作！");
	}

}
