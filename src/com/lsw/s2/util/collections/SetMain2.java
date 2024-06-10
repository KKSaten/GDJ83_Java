package com.lsw.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {
	
	public static void main(String[] args) {
		
		String n = "123";
		
		Object obj = n;
		
		System.out.println(obj instanceof Integer); //
		System.out.println(obj instanceof String); //
		
		
		
		// 로또 번호
		// 1~ 45 : 중복없이 6개 
		Random random = new Random();
//		int num = random.nextInt(45)+1;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		while(list.size() != 6) {
//			
//		}
		
		
		
		
		
		int [] ar = new int[6];
		//배열에서도 한번 해보고, ArrayList에서도 한번 해보기
		
		
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = random.nextInt(45)+1;	
		}
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
		HashSet<Integer> hs = new HashSet<Integer>(); //어차피 중복을 허용치 않으므로 중복검사 안해도 됨
		
		while(hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}
		System.out.println(hs);
		
		
		
	}//main 끝

}
