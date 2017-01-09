package com.feiyu.proxy_pattern;
/**
 * 被代理类 叫西门庆吧
 * @author feiyu
 *
 */
public class RealSubject implements Subject {

	@Override
	public void Request() {
		System.out.println("西门庆和潘金莲上床");
	}

}
