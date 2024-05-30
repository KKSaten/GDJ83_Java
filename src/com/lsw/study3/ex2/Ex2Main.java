package com.lsw.study3.ex2;

public class Ex2Main {
	
	public static void main(String[] args) {
		
		Study st = new Study();
		int[] ar = {1,2,3,4,5};
		
		ar = st.add(ar); // 매개변수로 보내는 이 값을 => 인자값이라고 부른다
		System.out.println(ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]); 
		}
		
		System.out.println(" ");
		
		ar = st.remove(ar);
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]); 
		}
		
	}

}
