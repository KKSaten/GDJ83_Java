package com.lsw.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Object obj = new Object();
		Test test = new Test();
		String st = test.toString();
		System.out.println(st);
		System.out.println(test.toString());
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String name = "winter";
		String n = new String("winter");
		System.out.println(name.toString()); //주소가 아니라 winter가 나오는 이유는 toString이 오버라이딩 됐기 때문
		System.out.println(name);
	}
	
}
