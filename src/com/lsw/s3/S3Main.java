package com.lsw.s3;

public class S3Main {

	public static void main(String[] args) {
		
		//배열 선언
		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;
		

		
		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수";
		penguin.wing = 2;
		
		Animal animal = tiger; // is a 관계(상속관계).
							   //tiger앞 (Animal)이 안붙는 이유 : 모든 동물이 호랑이는 아니지만 모든 호랑이는 동물이니까
							   //primitive타입의 변수 형변환과 비슷한 개념임. int를 double에 넣을 때는 자동으로 바뀌는 것처럼
		animal = penguin; // 문법적으로는 문제가 없는데 실행하면 얘 때문에 오류가 뜸
						  // 설명하느라 아래 코드를 tiger 기준으로 짰는데 여기서 penguin을 넣었으니까
		
		System.out.println(animal.name);
//		System.out.println(animal.power); 
		
		
//		tiger = animal; // 얘는 안됨. 모든 호랑이는 동물이지만 모든 동물이 호랑이는 아니거든
		tiger = (Tiger)animal; //이렇게 해야해. 모든 animal중 Tiger를 tiger안에 넣는것
		
		
		
//		Tiger[] dropship = new Tiger[8]; //이러면 호랑이만 드랍쉽에 태울 수 있고 펭귄을 못태우니까
		Animal[] dropship = new Animal[8];
		dropship[0] = tiger;
		dropship[1] = penguin;
		
		
		Animal ani1 = dropship[0]; //tiger가 드랍쉽에 타는 순간 Animal타입이 되니까 내릴 때는 Animal타입이다 그래서 본래는 이게 맞고
		Tiger ani2 = (Tiger)dropship[0]; //그걸 이렇게 타입변환
		
		Eagle eagle = new Eagle();
		Airplane airplane = new Airplane();
		
		Fly fly = eagle;
		fly = airplane;
		
		
		
		
	}
	
}
