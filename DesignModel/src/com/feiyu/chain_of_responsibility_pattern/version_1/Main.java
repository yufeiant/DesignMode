package com.feiyu.chain_of_responsibility_pattern.version_1;
/**
 * 场景如下：你和你的领导请假，请一天是组长，请两天需要经理，请五天需要总监，请半个月需要老板
 * 的批准。
 * @author feiyu
 *
 */
public class Main {

	public static void main(String[] args) {
		Manager jinli = new Manager("金龙");
		Manager chenshuai = new Manager("陈帅");
		Manager erlang = new Manager("二狼");
		
		Request request = new Request();
		request.setRequestType("加薪");
		request.setRequestContent("小菜请求加薪");
		request.setRequestNumber(1000);
		
		jinli.GetRequest("经理", request);
		chenshuai.GetRequest("总监", request);
		erlang.GetRequest("总经理", request);
		
		Request request2 = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜希望休息几天");
		request.setRequestNumber(5);
		
		jinli.GetRequest("经理", request);
		chenshuai.GetRequest("总监", request);
		erlang.GetRequest("总经理", request);
		
		
		
	}

}
