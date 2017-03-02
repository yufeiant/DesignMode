package com.feiyu.chain_of_responsibility_pattern.version_2;

public class ConcreteHandler extends Manager {

	public ConcreteHandler(String name) {
		super(name);
		
	}

	@Override
	public void HandlerRequest(Request request) {
		
		if(request.getRequestType()==requestType1&&request.getRequestNumber()<=2){
			System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"被批准了");
			
		}else{
			successor.HandlerRequest(request);		
		}

	}

}
