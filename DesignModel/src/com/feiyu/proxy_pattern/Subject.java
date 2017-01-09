package com.feiyu.proxy_pattern;
/**
 * 定义了proxy代理和RealSubject被代理的公共接口，这样就在任何使用RealSubject的地方使用
 * proxy
 * @author feiyu
 *
 */
public interface Subject {
	public void Request();
}
