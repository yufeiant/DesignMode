package com.feiyu.chain_of_responsibility_pattern.version_2;

/**
 * 进化版，在这里我们要职责链模式来实现version_1中的场景。
 * 
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		Manager jinli = new ConcreteHandler("金龙");
		Manager chenshuai = new ConcreteHandler2("陈帅");
		Manager erlang = new ConcreteHandler3("二狼");
		
		jinli.setSuccessor(chenshuai);
		chenshuai.setSuccessor(erlang);
		
		Request request = new Request();
		request.setRequestType("加薪");
		request.setRequestContent("小菜请求加薪");
		request.setRequestNumber(1000);
		jinli.HandlerRequest(request);//只需要调用第一个对象，后面的处理会向下传递
		
		Request request2 = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜希望休息几天");
		request.setRequestNumber(5);
		jinli.HandlerRequest(request);//只需要调用第一个对象，后面的处理会向下传递
		
	}

}
