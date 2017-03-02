package com.feiyu.chain_of_responsibility_pattern.version_1;
//管理者
/**
 * 一旦代码中出现下面这么长的判断条件，就意味着代码的味道坏了
 * @author feiyu
 *
 */
public class Manager {
	protected String name;
	private String requestType = "请假";
	private String requestType2 = "加薪";
	public Manager(String name){
		this.name = name;
	}
	//得到结果
	public void GetRequest(String managerLevel,Request request){
		if(managerLevel == "经理"){
			if(request.getRequestType()==requestType&&request.getRequestNumber()<=2){
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"被批准了");
				
			}else{
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"无权处理");
			}
		}else if(managerLevel == "总监"){
			if(request.getRequestType()==requestType&&request.getRequestNumber()<=5){
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"被批准了");
				
			}else{
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"无权处理");
			}
		}else if(managerLevel == "总经理"){
			if(request.getRequestType()==requestType){
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"被批准了");
				
			}else if(request.getRequestType()==requestType2&&request.getRequestNumber()<=500){
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"被批准了");

			}else if(request.getRequestType()==requestType2&&request.getRequestNumber()>500){
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"再说吧");

			}else{
				System.out.println(name+request.getRequestContent()+request.getRequestNumber()+"无权处理");
			}
		}
	}
}
