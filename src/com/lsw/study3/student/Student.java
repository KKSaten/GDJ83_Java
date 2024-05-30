package com.lsw.study3.student;

public class Student {

	int num;
	String name;
	int kor;
	int eng;
	int math;
	int totals;
	double avgs;
	
	//변수 선언 공식 데이터타입명 변수명 = 
	//객체 생성 공식 new 클래스명(); -> 객체의 주소를 리턴
	//클래스는 그 자체로 데이터타입으로도 사용
	//메서드 선언 공식
	//public static void main(String [] args) {} 메서드 선언부, 혹은 메서드 헤더라고 부름
	//접근지정자 그외지정자 리턴타입 메서드명(매개변수들 선언) {실행할 코드}
	//그외지정자, 매개변수들 선언 부분은 쓸 수도 있고 아닐 수도 있음. 필요하면 사용하는 것
	
	//
	//전급지정자 class 클래스명 {
	//	멤버변수
	//	접근지정자 [그외지정자] 데이터타입 변수명;
	
	//	멤버메서드
	//	접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]){}
	//}
	
	public void info( ) {
		int num = 10; //왜 중복선언이 아닐까?
		//위 Student의 num은 인스턴스변수, heap 메모리에 있고
		//info의 num은 지역변수, stack 메모리에 있다 서로 영역이 다름. 그림을 그려보자
		
		System.out.println("info 실행");
		
	}
	
	
}
