package com.feiyu.chain_of_responsibility_pattern;
/**
 * 处理请求的接口
 * @author feiyu
 *
 */
public abstract class Handler {
	
	protected String name;
	
	public Handler(String name) {
		super();
		this.name = name;
	}

	protected Handler successor;
	//设置继任者
	
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	//请求处理的抽象方法
	public abstract void HandlerRequest(int request);
}
