package com.feiyu.publish_subcribe_pattern.version_4;
/**
 * 观察者-事件委托
 * 如果这里能用pythond的概念，直接把方法名传过来，然后让其调用，简直太方便了，而java中
 * 我们还得用反射。
 * 
 * 委托时间模式：
 * 一个委托可以搭载多个方法，所有方法被依次唤起，更加重要的是，它可以使得委托对象所搭载的
 * 方法并不需要属于同一个类。甚至不知道是谁的。
 * 
 * 
 * 
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Subject secretary = new Secretary();
		NBAObserver nba = new NBAObserver("赵四");
		StockObserver stock = new StockObserver("前五");
		
		secretary.setAction("班主任回来了");
		try {
			secretary.Attach((Object)nba,nba.getClass().getMethod("CloseNBA", new Class[] {String.class}));
			secretary.Attach((Object)stock,stock.getClass().getMethod("CloseStock", new Class[] {String.class}));
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		secretary.Notify();
	}
}