package com.jobportal.response;


//import com.naukri.common.Object;
//import com.naukri.common.Override;
//import com.naukri.common.Response;
//import com.naukri.common.String;

public class Response {

	private String status;
	private int code;
	private Object result;
	private String msg;

	public Response success(Object t) {
		this.code = 200;
		this.status = "ok";
		this.result = t;
		return this;
	}

	public Response fail(String errorMessage) {
		this.code = 500;
		this.status = "fail";
		this.result = null;
		this.msg = errorMessage;
		return this;
	}

	public Response fail(String errorMessage, int errorCode) {
		this.code = errorCode;
		this.status = "fail";
		this.result = null;
		this.msg = errorMessage;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", code=" + code + ", result=" + result + ", msg=" + msg + "]";
	}

}
