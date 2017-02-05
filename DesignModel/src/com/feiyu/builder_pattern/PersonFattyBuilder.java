package com.feiyu.builder_pattern;

import java.awt.Graphics;
import java.awt.Point;

public class PersonFattyBuilder extends PersonBuilder {

	public PersonFattyBuilder(String g, String p) {
		super(g, p);
	}

	@Override
	public void BuildHead() {
		
		System.out.println("这是一个胖子的脸");

	}

	@Override
	public void BuildBody() {
		
		System.out.println("身体");

	}

	@Override
	public void BuildArmLeft() {
		
		System.out.println("左手");

	}

	@Override
	public void BuildArmRight() {
		
		System.out.println("右手");
	}

	@Override
	public void BuildLegLeft() {
		
		System.out.println("左腿");
	}

	@Override
	public void BuildLegRight() {
		
		System.out.println("右腿");

	}

}
