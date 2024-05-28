package com.lsw.study2;

public class S2_Study1 {
	
	public static void main(String [] args) {
		
		//배열 : 하나의 변수로 여러 개의 데이터를 다룰 때 사용
		//let ar = [1,2,3,'a','4',true]; 자바스크립트에서의 배열
		//근데 자바는 한 배열 안에 같은 데이터 타입만 모을 수 있고, 모을 갯수도 정해야한다.
		//배열 선언
		//같은 데이터 타입만 모을 수 있기 때문에
		//선언을 할 때 모을려고 하는 데이터 타입을 적는다
		//변수타입[] 변수명 = new 변수타입 [갯수];
		//본래 변수 정의할 때
		//데이터타입 변수명 = 이렇게 정의하잖아 
		//그럼 ' 변수타입[] '이 부분이 통째로 데이터타입을 의미하는 것이다
		int[] num1 = new int [3]; // [3]은 배열에 들어갈 데이터값의 '갯수'임
		int[] num2 = {1,2,3}; //이렇게도 가능. 이건 값을 직접 집어넣는 것
		//num은 int 배열이 데이터 타입인 것이지
		//new는 heap 영역에 무언가 만들겠다는 뜻으로
		//객체를 생성할 때 사용하는 연산자다.
		
		String[] names = new String [2]; 
		System.out.println(names);
		System.out.println(num1);
		System.out.println(num1[0]);
		System.out.println(num2[0]);
		
		num1[0] = 27;
		num1 = num2; //같은 타입의 배열이므로 값을 넣을 수 있음 다른타입은 불가
		//여기서 heap 메모리에 저장되어있던 값의 주소를 stack에 있는 num1이 가지고 있었는데 상실됨
		//하지만 데이터는 heap메모리에 여전히 남아 메모리를 차지함.
		
		
		
	}
}
