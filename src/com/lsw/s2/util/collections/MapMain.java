package com.lsw.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println(map.isEmpty());
		
		map.put("k1", 1);
		map.put("k2", 2);
		
		System.out.println(map.get("k1"));
		System.out.println(map.size());
		System.out.println(map.containsKey("k1"));
		System.out.println(map.containsValue(1));
		System.out.println(map);
		
		map.remove("k2", 3); //k2키의 value값이 2이므로 지워지지 않았음
		map.clear();
		
		Iterator<String> it = map.keySet().iterator();
		
		
		
		while(it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		
		
	}
	
}
