package com.lsw.s4.io.ex1;

import java.util.List;

import com.lsw.s4.io.ex1.ReadStudy;


public class Ex1Main {
	
	public static void main(String[] args) {
		
		ReadStudy rs = new ReadStudy();
		try {
			List<MenuDTO> menu = rs.read();
			
			for(MenuDTO menuDTO : menu) {
				System.out.println(menuDTO.getMenuName());
				System.out.println(menuDTO.getPrice());
				System.out.println(menuDTO.getKcal());
				System.out.println("================");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	}//main 끝
	
}
