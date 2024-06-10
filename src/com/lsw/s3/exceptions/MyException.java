package com.lsw.s3.exceptions;

public class MyException extends Exception { //Exception클래스 상속받아서
	
	public MyException() {}
	
	public MyException(String message) {
		super(message); //super는 부모 호출
	}

}
