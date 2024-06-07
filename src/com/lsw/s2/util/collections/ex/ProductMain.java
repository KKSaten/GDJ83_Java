package com.lsw.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		ArrayList<ProductDTO> ar = productService.init();
//		productService.addProduct(ar);
		int result = productService.removeProduct(ar);
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i).getPrice());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getStock());
		}
		
	}

}
