package com.feiyu.proxy_pattern;
/**
 * 代理类
 * @author feiyu
 *
 */
public class Proxy implements Subject {
	private Subject realSubject;
	
	
	public Proxy(Subject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void Request() {
		if (realSubject!=null) {
			System.out.println("王婆把潘金莲带到了自己家");
			realSubject.Request();
		}

	}

}
