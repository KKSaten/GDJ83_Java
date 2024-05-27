package com.lsw.study1;

public class Study2 {

	public static void main (String [] args) {
		
		//규칙
		//첫글자가 대문자면 class
		//첫글자가 소문자면 변수, 메서드
		//메서드는 ()를 가지고 있고 변수는 없음
		
		//Reference type(객체)
		String name1 = "winter";
		//원래는
		String name2 = new String("winter"); //이렇게 써야함
		Object obj = new Object();
		
		int age = 30;
		String na = "iu";
		
		
		//형변환(Cascading)
		//형태의 변환(type의 변환)
		//primitive 타입끼리만 형변환 가능 (boolean 제외)
		
		//강제 형변환(명시적 형변환)
		//큰 타입을 작은 타입에 넣을 때
		//데이터 값이 바뀔 가능성이 있음
		long num1 = 30L;
		int num2 = (int)num1;
		
		//자동 형변환(묵시적 형변환)
		//작은 타입을 큰 타입에 넣을 때
		float f1 = 1.2F;
		double dl = f1;
		//byte -> short, char -> int -> long -> float -> double
		//수 표현의 갯수(비트 조합)로 결정됨. byte 크기가 아니라
		//비교샷
		int total1 = 100;
		int avg1 = total1 / 3; //3도 정수형 타입이잖어
		System.out.println(avg1);
		
		double total2 = 100;
		double avg2 = total2 / 3;
		System.out.println(avg2);
		
		int total3 = 100;
		double avg3 = total3 / 3;
		System.out.println(avg3);
		
		avg3 = 33.33;
		total3 = (int)avg3;
		
		System.out.println(avg3);
		System.out.println(total3);
		
		//over flow
		byte b = 127; //byte가 담을 수 있는 최대값
		byte b2 = 1;
		b = (byte)(b + b2); //값이 오버되서 128이 아니라 -128로 돌아가버림
		System.out.println(b);
		//under flow
		b = -128; //byte가 담을 수 있는 최소값
		b2 = -1;
		b = (byte)(b + b2);
		System.out.println(b); //이 또한 담을 수 있는 최소값이 오버되서
							   //-129가 아니라 127이 되어버림
		
		
		
		age = 1;
		na = "1";
		//System.out.println(age==na); 오류가 뜬다
		//레퍼런스 타입과 프리미티브 타입은 서로 연산이 안됨
		
		//연산자는 같은 타입끼리만 연산이 가능
		//산술연산자 : +, -, *, /, %
		System.out.println(1.2+3);
		
		
	}
	
}
