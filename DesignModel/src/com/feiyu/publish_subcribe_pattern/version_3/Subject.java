package com.feiyu.publish_subcribe_pattern.version_3;
/**
 * 通知者接口
 * @author feiyu
 *
 */
public interface Subject {
	void Attach(Observer observer);
	void Detach(Observer observer);
	void Notify();
	String getAction();
	void setAction(String action);
}
