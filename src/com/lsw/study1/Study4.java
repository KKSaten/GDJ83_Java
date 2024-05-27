package com.lsw.study1;

import java.util.Scanner;

public class Study4 {

	public static void main(String [] args) {
		
		//키보드와 연결 준비
		//한번만 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요"); // 0 이상의 정수를 입력 받음
		
		int num = sc.nextInt();
		
		System.out.println(num);
		
		// 1 -> 1
		// 2 -> 2
		// 3 -> 3
		// 4 -> 10
		// 5 -> 11
		// 7 -> 13
		// 8 -> 20
		// 4진수
		// 15 -> 33
		// 16 -> 100
		// int a = 10*(a/4) + (a%4) //16부터는 불가
		
		 
		
		
	}
	
}
