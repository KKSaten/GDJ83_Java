package com.lsw.study3.ex2;

public class Study {
	
	public int[] add(int[] ar) {
		System.out.println(ar.length);
		int[] ar2 = new int[ar.length + 1]; 
		
		for(int i=0; i<ar.length; i++) {
			ar2[i] = ar[i];
		}
		return ar;
		
	}
	
	public int[] remove(int[] ar) {
		int[] ar2 = new int[ar.length - 1];
		
		for(int i = 0; i<ar2.length; i++) {
			ar2[i] = ar[i];
		}
		return ar2;
	}
	

}
