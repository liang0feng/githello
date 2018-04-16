package com.atguigu.bean;

public class AppReturn {

	public String status;
	public String msg;
	public Object obj;
	@Override
	public String toString() {
		return "AppReturn [status=" + status + ", msg=" + msg + ", obj=" + obj + "]";
	}
	public AppReturn(String status, String msg, Object obj) {
		super();
		this.status = status;
		this.msg = msg;
		this.obj = obj;
	}
	public AppReturn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}
