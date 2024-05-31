package com.lsw.s2;

public class MidStudent extends Student{ //Student클래스를 상속,확장

	//눈에 보이지 않지만 Student에서 선언한 변수들이 전부 들어와있다고 생각하면 됨
	//추가할 것들만 적어주면 됨
	
	
	public MidStudent() {
//		super(); // 부모의 생성자를 불러오기. 따로 적지 않아도 되고 그냥 생략되어있는 상태
	}
	
	public void midInfo() {
//		System.out.println(this.num); //확장을 했어도 num에 private을 걸어놨으므로 getNum()을 이용해야함
//		System.out.println(this.getNum());
//		super.info();
		System.out.println(this.history);
	}
	
	
	
	private int history;

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
	
	
}