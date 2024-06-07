package com.lsw.s1.lang;

import java.util.Scanner;

public class S1Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//import 생략 가능한 것은 다음과 같다
		// 1) 같은 패키지 내에 있는 클래스는 생략
		// 2) java.lang 내에 있는 클래스를 사용할 때 import 생략
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj == obj2); //주소값끼리 비교
		
		//String 알고가기
		String n = new String("winter");
		String n2 = "winter"; // 이것 또한 참조변수
		System.out.println(n == n2); //주소값끼리 비교
		//참조변수를 찍으면 toString()을 자동호출한다 -> 주소값을 호출 -> 모든 클래스는 Object
		//toString, equals 오버라이딩
		//method를 호출할 수 있어야 함
		
		char ch = n.charAt(0); //문자의 0번째 목록 출력
		System.out.println(ch);
		
		int num = n.length(); //메서드 
		System.out.println(num);
		
		System.out.println("문자열 입력");
		n = sc.next();
		for(int i=0; i<n.length(); i++) {
			System.out.println(n.charAt(i));
		}
		
	}//main 끝
	
}
