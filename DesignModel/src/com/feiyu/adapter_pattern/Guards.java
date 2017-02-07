package com.feiyu.adapter_pattern;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("后卫进攻");

	}

	@Override
	public void Defense() {
		System.out.println("后卫防守");

	}

}
