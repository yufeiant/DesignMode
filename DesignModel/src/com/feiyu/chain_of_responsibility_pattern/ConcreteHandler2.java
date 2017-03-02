package com.feiyu.chain_of_responsibility_pattern;

public class ConcreteHandler2 extends Handler {

	public ConcreteHandler2(String name) {
		super(name);
		
	}

	@Override
	public void HandlerRequest(int request) {
		if(request>=11&&request<=20){
			System.out.println(name+request+" 处理请求");
		}else{
			if(successor!=null){
				successor.HandlerRequest(request);
			}
		}

	}

}
