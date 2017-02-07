package com.feiyu.adapter_pattern;

public class ForeignCenter {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void 进攻(){
		System.out.println(name+"进攻");
	}
	
	public void 防守(){
		System.out.println(name+"防守");
	}
}
