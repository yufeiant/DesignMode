package com.feiyu.adapter_pattern;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("前锋进攻");

	}

	@Override
	public void Defense() {
		System.out.println("前锋防守");

	}

}
