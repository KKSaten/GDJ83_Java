package com.lsw.study3.ex4;

import java.util.Scanner;

public class Ex4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//그럼 여태 입력받을 때 써오던 얘도 뭔지 알겠지
		//뒤에 있는 Scanner()가 생성자!
		//다만 얘는 값이 반드시 있어야 사용가능한 것
		
		Car car = new Car();
		
		car.info();
		
		Car car2 = new Car(200);
		car2.info();
		
		
		
		//Bike bike = new Bike();
		Bike bike = new Bike("", 4);
		//기본형은 왜 오류가 날까?
		//Bike 클래스에서 매개변수가 있는 생성자를 선언했기 때문
		//생성자는 무조건 1개이상 있어야하기 때문에
		//아무것도 적지 않으면 컴파일러가 자동으로 기본생성자를 생성한다.
		//그런데 매개변수가 달린 생성자를 선언해버리면 이미 1개 이상 존재하게 되므로
		//컴파일러가 기본생성자를 만들어주지 않기 때문에 오류가 나는 것
		
	}
	
}
