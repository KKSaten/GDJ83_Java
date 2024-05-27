package com.lsw.study1;

public class Study3 {

	public static void main(String [] args) {
		//연산자
		// + 산술연산자
		// + 연결연산자 : 문자열 + primitive => 문자열
		//sysout + ctrl + space
		System.out.println("1" + 1);
		System.out.println(1 + "1" + 1);
		System.out.println(1 + 'a' + "1"); // 'a'는 char타입 "1"은 문자열이므로
										   // 서로 연산이 안된다
										   // 1 + 'a'에서 a가 int타입으로 자동 형변환 된 것
										   // 아스키코드에서 a는 97의 10진값을 가지므로 981이 나온 것
		
		//예제
		//물건을 고르고, 물건의 총합계, 돈을 내고, 잔돈을 받고
		int total = 15760;
		int pay = 50000;
		// 잔돈 계산
		int change = pay - total;
		
		//만원짜리 지폐를 담을 변수
		int ten_thous = 10000;
		ten_thous = change / ten_thous;
		
		//천원짜리 지폐를 담을 변수
		int thous = 1000;
		change = change - (ten_thous*10000);
		thous = change / thous;
		
		//백원짜리 지폐를 담을 변수
		int hund = 100;
		change = change - (thous*1000);
		hund = change / hund;
		
		change = pay - total;
		
		System.out.println("잔돈 : " + change);
		System.out.println("만원짜리 : " + ten_thous);
		System.out.println("천원짜리 : " + thous);
		System.out.println("백원짜리 : " + hund);
		
		
		
	}
	
}
