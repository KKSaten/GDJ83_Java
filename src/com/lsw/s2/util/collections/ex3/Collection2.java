package com.lsw.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;

public class Collection2 {

	public void useList(List<Integer> ar) {
		//기존 for문
		//for(초기식;조건식;증감식) {}
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//향상된 for문
		//for(꺼낼데이터타입 변수명: collection의 참조변수명) {}
		//i가 없어서 인덱스 번호에 맞춰서 들어가는게 아니기 때문에
		//단순 반복을 위해서 사용
		for(Integer n: ar) {
			System.out.println(n);
		}
		
	}//useList 끝
	
	public void useMap(Map<String, Integer> map) {
		map.get("");
	}
	
	
}
