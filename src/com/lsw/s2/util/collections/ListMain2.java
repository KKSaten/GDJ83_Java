package com.lsw.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// Generic : 타입에 제한
		// ArrayList를 자동완성하면 <E>가 붙는데 여기서 E는 변수다
		
		ArrayList<String> ar = new ArrayList<String>();
		//이렇게 사용하면 String 데이터타입만 모으겠다는 것.
		//생략하면 Object가 되기에 여러 타입을 넣을 수 있는 것처럼 쓸 수 있는 것.
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		
		ar.add("first");
//		ar.add(2);
//		ar.add('c');
//		ar.add(true);
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		String name = (String) ar.get(0); //배열기반이기 때문에 실제로는 같은 타입만 모을 수 있다
										  //그럼 왜 String이고 int고 다 넣을 수 있을까?
								 		  //Object타입이기 때문. 즉 나올 때도 Object타입이기 때문에
								 		  //인덱스 0번의 "first"가 String타입이라고 착각할 수 있지만 Object타입이다.
										  //그래서 (String)을 붙여 형변환해주지 않으면 에러가 난다.
		
	}
	
}
