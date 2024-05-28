package com.lsw.study2;

import java.util.Scanner;

public class S2_Study2 {
	
	public static void main(String [] args) {
		
		int[] ar = new int[5];
		
		//각 인덱스번호 칸에 값을 키보드로 입력받아서 저장하기
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=ar.length; i++) {
			System.out.println(i +"번째 값 입력");
			ar[i] = sc.nextInt();
		}
		System.out.println(ar);
		
		
		//배열의 크기를 키보드로 입력받아서 배열 선언하기
		System.out.println("배열의 크기 입력");
		int n = sc.nextInt();
		int[] ar2 = new int[n];
	}

}
