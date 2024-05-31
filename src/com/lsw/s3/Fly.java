package com.lsw.s3;

public interface Fly {
	
	//상수
	//인터페이스의 접근지정자는 public만 가능
	//상수니까 그외지정자는 무조건 final
	public final int NUM = 1;
	String NAME = "abc";
	
	
	//추상메서드
	//접근지정자 public
	//그외지정자 abstract 둘 다 고정임
	//그래서 둘 다 생략 가능 안쓰여있어도 public abstract
//	public abstract void t1();
//	public int t2();
//	abstract String t3(int num);
//	void t4();
	
	public abstract void flyAble();
	

}
