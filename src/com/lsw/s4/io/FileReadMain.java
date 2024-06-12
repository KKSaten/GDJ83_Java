package com.lsw.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\study", "study.java");
		FileReader fr = null;
		BufferedReader br = null;
		try { //해당 파일이 없을 경우를 대비해 예외 처리
			fr = new FileReader(file); //문자 취급하는 애를
			br = new BufferedReader(fr); //문자열 취급하는 애로 연결
			
			while(true) {
				String s = br.readLine();
				if(s == null) {
					break;
				}
				System.out.println(s);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				br.close(); //다 썼으면 외부자원과 연결되어있는 상태를 끊어줘야함. 순서는 연결할 때의 역순 
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("종료");
		
		
	}//main 끝

}
