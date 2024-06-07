package com.lsw.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;

public class ProductService {
	
	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);
	
	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, 아이폰, 50,");
		sb.append("45000, 갤럭시, 100,");
		sb.append("30000, 노키아, 20");
	} 
	
	public ArrayList<ProductDTO> init() {
		
		String datas = this.sb.toString();
		ArrayList<ProductDTO> ar = new ArrayList();
		StringTokenizer st = new StringTokenizer(datas, ",");
		
		while(st.hasMoreTokens()) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setPrice(Integer.parseInt(st.nextToken().trim())); // 50000, 45000, 30000 
			productDTO.setName(st.nextToken().trim()); //아이폰, 갤럭시, 노키아
			productDTO.setStock(Integer.parseInt(st.nextToken().trim())); //50, 100, 20
			ar.add(productDTO);
		}
				
		return ar;
	}
	
	//기존의 가방에다가 새상품을 추가
	public void addProduct(ArrayList<ProductDTO> ar) {
		ProductDTO productDTO = new ProductDTO();
		System.out.println("상품명을 입력하세요");
		productDTO.setName(sc.next());
		System.out.println("가격을 입력하세요");
		productDTO.setPrice(sc.nextInt());
		System.out.println("재고를 입력하세요");
		productDTO.setStock(sc.nextInt());
		ar.add(productDTO);
		
	}

	//기존의 가방을 받아서 삭제, 물건의 이름을 입력받아서 삭제
	public int removeProduct(ArrayList<ProductDTO> ar) {
		System.out.println("삭제할 상품명을 입력하세요");
		String name = sc.next();
		int result = 0;
		
		for(int i=0; i<ar.size(); i++) {
			if(name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;
				break;
			}//if문 끝
		}//for문 끝
		
		return result;
	}
	
}
