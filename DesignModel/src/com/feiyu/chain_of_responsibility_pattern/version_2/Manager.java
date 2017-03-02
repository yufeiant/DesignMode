package com.feiyu.chain_of_responsibility_pattern.version_2;

/**
 * 管理者
 * @author feiyu
 *
 */
public abstract class Manager {
	protected String name;
	protected String requestType1 = "请假";
	protected String requestType2 = "加薪";
	public Manager(String name) {
		super();
		this.name = name;
	}

	protected Manager successor;
	//设置继任者
	
	public void setSuccessor(Manager successor){
		this.successor = successor;
	}
	
	//请求处理的抽象方法
	public abstract void HandlerRequest(Request request);
}
