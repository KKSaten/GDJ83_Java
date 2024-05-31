package com.lsw.s4;

public class Car {
	
	//변수 선언
	//접근지정자 [그외지정자] 데이터타입 변수명
	public static String company = "abc";
	
	
	static {
		
	}
	
	
	//
	public int price;;
	
	
	public static void info() {
		System.out.println(Car.company);
//		System.out.println(this.price);
		System.out.println("static method");
//		this.info2();
	}
	
	public void info2() {
		Car.info();
		System.out.println(Car.company);
		final int NUM = 30;
//		num = 20; //final을 사용하면 초기값에서 값을 변경할 수 없다.
		//final은 메서드 앞에도, 클래스 앞에도 붙을 수 있다. 그럴 경우 상속을 못하게 하는 것인데
		//이후 내용에서 배울 것. 참고로 final이 붙는 변수는 보통 대문자로 표기한다.
	}
}
