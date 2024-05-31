package com.lsw.s3;

public class Tiger extends Animal{ //sleep이라는 추상메서드를 가지고 있기 때문에 여기까지만 썼을 때는 오류가 뜨는 것
	
	int power;
	
	//메서드 오버로딩
	//메서드 오버라이딩(overriding) : 상속받은 메서드를 재정의 하는 것
	//메서드의 선언부는(Header)는 동일하게
	//접근지정자는 같은 범위나 더 넓은 범위로는 수정이 가능.
	public void sleep() {//부모클래스 Animal에서 abstract로 선언해 body가 없던 sleep() 메서드를 여기서 완성하면 된다
		System.out.println("누워서 수면");
	}
	

}
