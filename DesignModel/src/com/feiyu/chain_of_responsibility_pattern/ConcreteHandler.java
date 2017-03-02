package com.feiyu.chain_of_responsibility_pattern;

public class ConcreteHandler extends Handler {

	public ConcreteHandler(String name) {
		super(name);
		
	}

	@Override
	public void HandlerRequest(int request) {
		if(request>=0&&request<=10){
			System.out.println(name+request+" 处理请求");
		}else{
			if(successor!=null){
				successor.HandlerRequest(request);
			}
		}

	}

}
