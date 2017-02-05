package com.feiyu.publish_subcribe_pattern.version_4;

import java.lang.reflect.Method;

public abstract class Subject {
	
	protected Method Update;
	abstract public void Notify();
	abstract public void setAction(String action);
	abstract public void Attach(Object object,Method method);
}
