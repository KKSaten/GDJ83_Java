package com.lsw.study1;

import java.util.Scanner;

public class Study8 {
	
	public static void main(String [] args) {
		
		//이중 for문
		
		//총게임
		//총알(30발짜리 탄창 3개)
		//점사(3발), 단발
		
		//1을 입력하면 단발모드 '탕' 소리가 30번
		//2를 입력하면 점사모드 '타다당'소리가 10번
		//다 쏘면  단발을 쏠지 점사를 쏠지 다시 물어봄
		//3번 반복
		
		
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.print("1.단발모드 2.점사모드 입력 : ");
			int shot = sc.nextInt();
			String sound = "타다당"; 
			int repeat = 10;
				if (shot == 1) {
					repeat = 30;
					sound = "탕";
				}
//				}else {
//					repeat = 10;
//					sound = "타다당";
//				}
				for(int j=1; j<=repeat; j++) {
					System.out.println(sound);
				}
		}
		
		
		
		
	}

}
