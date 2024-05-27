package com.lsw.study1;

import java.util.Scanner;

public class Study7 {

	public static void main(String [] args) {
		
		System.out.print("abc");
		System.out.println("def");
		System.out.println("123");
		
		//반복문 - for, while
		//for(초기식;조건식;증감식) {}
		//while(조건식){}
		//do{}while(조건식);
		//보조문 break; continue;
		
		//3과목의 점수를 입력 받아 합계 구하기
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for(int i=0; i<3; i++) {
			int num = sc.nextInt();
			result += num; // result = result + num;
			
		}
		
		//'a' -> 'z'까지 출력
		char alphabet = 'a';
		for(int i='a'; i<='z'; i++) {
			System.out.println(alphabet);
			alphabet++;
		}
		
		
		
	}
	
}
