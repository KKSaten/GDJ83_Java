package com.lsw.study3.ex3;

public class Calculator {
	
	//Method Overloading
	//같은 이름의 메서드를 여러 개 만드는 방법
	//원래라면 당연히 중복 선언일테니 이 방법엔 조건이 있음
	//매개변수의 타입의 조합이나 갯수가 달라야 성립
	//매개변수의 이름이 달라도 타입의 조합과 갯수가 같으면 성립하지 않음
	
	
	public void plus(int n1, int n2) {
		System.out.println(n1 + n2);	
	}
	public void plus(int n1, double n2) {
		System.out.println(n1 + n2);
	}
	
	
	//대표적인 오버로딩. int도 출력되고 String도 출력됨.
	public void println(int n) {
		//시스템 console에 츨력
	}
	public void println(String n) {
		//시스템 console에 츨력
	}

}
