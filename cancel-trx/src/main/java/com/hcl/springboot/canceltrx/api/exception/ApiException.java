package com.hcl.springboot.canceltrx.api.exception;

@javax.annotation.Generated(value = "class com.hcl.springboot.canceltrx.codegen.languages.SpringCodegen", date = "2017-05-19T06:17:46.555Z")

public class ApiException extends Exception{
	private int code;
	public ApiException (int code, String msg) {
		super(msg);
		this.code = code;
	}
}
