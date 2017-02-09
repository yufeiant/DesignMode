package com.feiyu.Singleton_pattern;
/**
 * 第六种：枚举
 * 此方法号称最安全的方法，jvm会保证枚举的初始化函数只被调用一次
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，
 * 可谓是很坚强的壁垒啊，不过，个人认为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，我也很少看见有人这么写过。
 * @author jfy
 *
 */
public class EnumSingleton6 {
	private EnumSingleton6 (){}
	public static EnumSingleton6 GetInstance(){
		return Singleton.INSTANCE.getInstance();
	}
	private static enum Singleton{
		INSTANCE;
		private EnumSingleton6 singleton;
		//JVM会保证此方法绝对只调用一次
		private Singleton(){
            singleton = new EnumSingleton6();
        }
		public EnumSingleton6 getInstance(){
			return singleton;
		}
	}
	public static void main(String[] args) {
		EnumSingleton6 obj1 = EnumSingleton6.GetInstance();
		EnumSingleton6 obj2 = EnumSingleton6.GetInstance();
	    //输出结果：obj1==obj2?true
	    System.out.println("obj1==obj2?" + (obj1==obj2));
	}
}
