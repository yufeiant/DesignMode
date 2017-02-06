package com.feiyu.abstract_factory_pattern.javabean;
/**
 * 用户数据库的实例
 * @author jfy
 *
 */
public class User {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
