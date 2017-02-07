package com.feiyu.adapter_pattern;

public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Attack() {
		System.out.println("中锋进攻");

	}
	@Override
	public void Defense() {
		System.out.println("中锋防守");

	}

}
