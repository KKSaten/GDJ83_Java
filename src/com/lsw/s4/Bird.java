package com.lsw.s4;

public abstract class Bird { //abstract는 미완성,불완전하다는 뜻이다.
	//추상 클래스이므로 상속받아서 사용해라~ 라는 의미라고함. 이런 클래스는 객체를 만들 수 없음

	int age;
	
//	public abstract void fly() { //추상 메서드. 상속 받아서 사용해야 한다	
//	}
	public abstract void fly(); //body 없이 선언만 해야한다... 이후 상속에서 배움
	
	
}
