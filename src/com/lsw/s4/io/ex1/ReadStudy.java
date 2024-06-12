package com.lsw.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {

	
	public List<MenuDTO> read() throws Exception{
		//info.txt 파일 읽어오기
		//1. 읽어서 파싱 후 DTO들을 만들어 DTO 리턴
		File file = new File("C:\\study", "info.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<MenuDTO> menu = new ArrayList<MenuDTO>();
		
		
		while(true) {
			String s = br.readLine();
			
			if(s == null) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s, ",");
			
			MenuDTO menuDTO = new MenuDTO();
			while(st.hasMoreTokens()) {
				menuDTO.setMenuName(st.nextToken().trim());
				menuDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
				menuDTO.setKcal(Integer.parseInt(st.nextToken().trim()));
			}
			
			menu.add(menuDTO);
		}//while문 끝
		
		br.close();
		fr.close();
		
		return menu;
		
		
	}//read{} 끝
	
}
