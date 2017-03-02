package com.feiyu.chain_of_responsibility_pattern;

public class ConcreteHandler3 extends Handler {

	public ConcreteHandler3(String name) {
		super(name);
		
	}

	@Override
	public void HandlerRequest(int request) {
		if(request>=21&&request<=30){
			System.out.println(name+request+" 处理请求");
		}else{
			if(successor!=null){
				successor.HandlerRequest(request);
			}
		}

	}

}
