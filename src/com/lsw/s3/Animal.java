package com.lsw.s3;

public abstract class Animal {//의도적으로 객체를 만들지 않게 하기 위해 abstract. 무조건 자식클래스가 상속받아 사용하기 위해 씀
	
	int age;
	String name;
	
	public abstract void sleep();

	
	
}