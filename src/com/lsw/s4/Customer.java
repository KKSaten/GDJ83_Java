package com.lsw.s4;

public class Customer {
	int money;
	int point;
	
	
	//int price, int point 두개 대신에 매개변수를 하나만 선언해보자
	public void buy(Machine m) {//물건의 가격과 포인트를 받아와야하므로 매개변수 사용
		//가진 돈에서 물건 가격을 뺌
		//가진 포인트에 물건 포인트를 더함
		this.money = this.money - m.price;
		this.point = this.point + m.point;
		
		System.out.println(money);
		System.out.println(point);
		
		
	}

}
