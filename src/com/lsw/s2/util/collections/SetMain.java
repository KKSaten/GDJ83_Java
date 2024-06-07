package com.lsw.s2.util.collections;

import java.util.HashSet;

import com.lsw.s2.util.collections.ex.ProductDTO;

public class SetMain {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("second"); //값의 중복을 허용치 않음
		
		System.out.println(hs); //순서가 유지되지 않음
		
		HashSet<ProductDTO> hs2 = new HashSet<ProductDTO>();
		
		ProductDTO productDTO = new ProductDTO();
		ProductDTO productDTO2 = new ProductDTO();
//		productDTO2 = productDTO; //이러면 중복일까 아닐까. 주소가 같아지므로 당연히 중복
		
		hs2.add(productDTO);
		hs2.add(productDTO2);
		
		System.out.println(hs2);
		
	}

}
