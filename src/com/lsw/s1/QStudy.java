package com.lsw.s1;

import java.util.Scanner;

public class QStudy {
	
	Scanner sc = new Scanner(System.in);
	
	
	public int[] add(int[] ar) {
		int newAddQ[] = new int[ar.length + 1]; //새로운 배열
		for(int i=0; i<ar.length; i++) { // 맨앞에 인덱스에 새로운 것 추가
			newAddQ[i] = ar[i];
		}
		System.out.println("마지막 인덱스에 추가할 숫자를 넣어주세요 : ");
		newAddQ[newAddQ.length - 1] = sc.nextInt();
		return newAddQ; // 인트 배열 타입
	}//add 메서드 끝
	
	
	public int[] remove(int[] ar) {
		//하나의 요소를 삭제 -> 맨 뒤에 인덱스를 삭제하고, 삭제된 배열을 리턴하자
		int newRemoveQ[] = new int[ar.length - 1];
		for(int i=1; i<newRemoveQ.length; i++) { // 맨앞에 0번 인덱스 삭제
			newRemoveQ[i] = ar[i];
		}
		return newRemoveQ;
	}//remove 메서드 끝
	

}
