package com.feiyu.adapter_pattern;
/**
 * 抽象运动员类
 * @author jfy
 *
 */
public abstract class Player {
	public String name;
	
	public Player(String name) {
		super();
		this.name = name;
	}
	public abstract void Attack();
	public abstract void Defense();
	
}
