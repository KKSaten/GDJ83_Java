package com.lsw.study3.ex4;

public class Car {
	
	
	String color;
	String brand;
	String company;
	int price = 1000; // 최종 가격은? 2500으로 출력이 됐다
	// 가장먼저 여기서 1000. 그다음이 저 아래 인스턴스 초기화블럭 2000, 최종적으로 생성자 메서드에서 2500으로 다시 덮어씌워졌다.
	
	
	
	// 생성자(Constructor) 메서드
	// Car car = new Car();
	// 바로 저 Car()부분이 생성자 메서드임
	// 시작이 대문자면 클래스, 소문자면 변수, 소문자인데 ()가 붙으면 메서드
	// 근데 대문자 시작인데 ()붙은 저게 바로 생성자 메서드
	
	//기본 생성자 (매개변수가 없는 생성자)
	public Car() {
//		this.color = "Black";
//		this.brand = "k3";
//		this.company = "Kia";
//		this.price = 2500;
		
		this(2500); //this.에서 쓰인 this는 참조변수
		System.out.println("자동차가 만들어집니다");
		// ()가 붙었으니 메서드네?
		// 자기 자신의 또 다른 생성자를 호출하는 용도다
		// this()는 생성자 내에서 제일 첫줄에 위치해야 한다
		// 자동차가 만들어집니다 출력문을 this(2500);위로 올려버리면 오류가 난다
		
			
	}
	public Car(int price) {
		//생성자 오버로딩도 가능!
		//this.는 생략이 가능하므로 둘이 같은 price인데 어떻게 구분할까?
		//라는 상황에서 바로 this.를 명시해줘야한다
		//this.price는 Car 클래스에서 선언된 멤버변수 price,
		//뒤 price는 Car(int price)에서 선언된 지역변수! 
		this.price = price;
		this.color = "Black";
		this.brand = "k3";
		this.company = "Kia";
	}
	public Car(int price, String color) {
//		this.price = price;
//		this.color = color;
//		this.brand = "k3";
//		this.company = "Kia";
		this(2500, "Black", "k3");
	}
	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "Kia";
		//객체를 만들려고 new Car();를 선언할 때 앗싸리 매개변수를 이용해서 초기화 값을 넣겠다!
	}
	
	
	
	
	
	
	
	
	{
		//인스턴스 초기화 블럭
		price = 2000;
	}
	
	
	
	
	
	
	//참조변수 : 객체의 주소를 담고있는 변수
	//참조변수 this -> 자기 자신의 객체의 주소를 담고 있음
	//객체 생성시 같이 대입되는 변수
	//각각의 객체 내에서만 사용가능
	//각 개체 본인을 가리키는 용이므로 main에서는 사용할 수 없음
	
	public void info() {//this 쓰면 매개변수를 안써도 됨
		System.out.println("info");
		System.out.println(this.color);
		System.out.println(brand); // this.는 생략가능!
		this.go(); // 자기 자신의 또 다른 메서드를 불러내는 것도 가능
	}	
	public void go() {
		System.out.println(this.company);
		System.out.println(this.price);
		
	}
	
}
