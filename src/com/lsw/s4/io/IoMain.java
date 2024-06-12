package com.lsw.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {
	
	public static void main(String[] args) {
		
		InputStream is = System.in; //bit 처리
		InputStreamReader ir = new InputStreamReader(is); //char 처리
		BufferedReader br = new BufferedReader(ir); //String
		//여기까지하면 입력받을 준비 끝
		
		System.out.println("입력하세요");
		
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
		
		//실행해보면 Scanner 기능이랑 똑같음.
		//이걸 구현한 라이브러리는 많음 원리를 알기 위해 작성해본 것
		
		
		
		
	}

}
