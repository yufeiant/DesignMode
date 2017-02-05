package com.feiyu.publish_subcribe_pattern.version_4;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 通知者，老板回来了
 * @author feiyu
 *
 */
public class Secretary extends Subject {
	
	private String action;
	private Map<Object,Method> methods = new HashMap<Object,Method>();
	@Override
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public void Notify() {
		for (Object object : methods.keySet()) {
			try {
				methods.get(object).invoke(object, action);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void Attach(Object object,Method method) {
		methods.put(object, method);
	}

}
