package com.lsw.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {
	
	public static void main(String[] args) {
		
		//문자열 -> 문자 -> 비트
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파일명 입력");
		String fileName = sc.next();
		
		File file = new File("C:\\study", fileName);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			
			String flag = "";
			while(!flag.equals("e")) {	
				System.out.println("내용 입력 : ");
				String s = sc.next();
				
				//e, E가 입력되면 종료
				flag = s.toLowerCase();
				System.out.println(flag);
				
				fw.write(s+ "\r\n");
				fw.flush(); // 버퍼의 남은 용량을 치워버리기 위함
			}//while문 종료
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
