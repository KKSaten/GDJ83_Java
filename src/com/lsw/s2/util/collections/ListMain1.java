package com.lsw.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {
	
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList(); //배열기반이지 배열은 아이라 하심
		String name = "winter";
		int num = 2;
		ar.add(name); //인덱스 0번
		ar.add(num); //int가 Integer로 오토박싱 되어서 그게 부모가 Object니까 드갈 수 있는 것
		ar.add(3.12); //마찬가지로 double이 Double로 오토박싱된 것
		ar.add('a'); //이하동문
		ar.add(false);
		ar.add(num); //중복된 값도 허용됨, 순서유지도 됨
		//일반적인 배열과의 차이점은 데이터타입의 제한이 없고, 길이를 제한하지 않아도 된다. 아주 편리
		//다만 배열 자체가 같은 데이터타입만 허용하기 때문에 디테일한 설명은 ListMain2 클래스 파일 참조
		
		ar.add(1, "test"); //1번 인덱스에 끼워넣겠다. 나머지가 다 뒤로 한칸씩 밀림
		
		ar.set(0, 'c');
		
		ar.remove(0); //0번 인덱스 삭제
		ar.remove(2);
		
//		ar.clear(); //모든 요소 삭제
		
		for(int i=0; i<ar.size(); i++) { //메서드로 만든거라서 length를 사용하지않고 size			
			System.out.println(ar.get(i)); 
		}
		
		LinkedList lk = new LinkedList(); // 편집 연산 속도가 훨씬 빠름
										  // 위에서는 add, remove 등을 하면 데이터 인덱스를 앞에서 자르고 복사하고 붙이고 이렇게 작동하는데
										  // LinkedList에서는 각 인덱스번호를 가리키는 주소값만 갈아치워지기 때문에 연산이 빠름
										  // 대신 각 인덱스마다 주소를 통해 데이터를 일일이 찾아와야하므로 데이터가 많아질수록 데이터 접근의 속도가 느려짐
										  // 그래서 무엇을 쓸지 자료구조에 따라서, 상황에 맞게 골라 써야함
		lk.add("ad");
		
		
		
		

		
	}//main 끝

}
