package com.lsw.study3;

import java.util.Random;

public class StudyReturn {

	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수선언]) {}
	
	
	//매개변수 선언
	public void t4(int sal) {
		//프리랜서가 월급을 받아서 3.3% 원천징수 세금 떼고 실수령액 계산
		//실수령액 = 월급 - 월급*0.033
		
		double result = sal - sal*0.033;
		System.out.println(result);
		
		sal = 100;
	}
	
	//매개변수는 0개일 수도, 2개 이상일 수도 있고, 클래스가 들어올 수도 있다
	public Test t5(Test t) {
		System.out.println(t.level);
		t.level = 200;
		t = new Test();
		t.level = 500;
		
		return t;
	}
	
	//리턴타입은 제한 없음
	public int t1() {
		int num =3;
		if (num % 2 == 0) {
			return 0;
		}
		int num2 = 6;
		int result = num*num2;
		
		return num;
	}
	
	public void t2() {
		Random random = new Random();
		//0이상 10미만의 정수 하나를 랜덤하게 리턴
		int num = random.nextInt(10);
		if(num%2 == 0) {
			return; //void에서 사용하는 끝내기 위한 return;
		}else {
			System.out.println(num);
		}
		
	}
	
}
