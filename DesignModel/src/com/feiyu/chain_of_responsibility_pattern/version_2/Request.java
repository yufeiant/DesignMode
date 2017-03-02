package com.feiyu.chain_of_responsibility_pattern.version_2;
/**
 * 请求类
 * @author feiyu
 *
 */
public class Request {
	//请求类别
	private String requestType;
	//请求内容
	private String requestContent;
	//请求数量
	private int requestNumber;
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestContent() {
		return requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	public int getRequestNumber() {
		return requestNumber;
	}
	public void setRequestNumber(int requestNumber) {
		this.requestNumber = requestNumber;
	}
}
