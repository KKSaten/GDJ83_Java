package com.lsw.s6.network.ex1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClientEx1 {

	public static void main(String[] args) {
		
		Socket socket = null;;
		Scanner scanner = new Scanner(System.in);
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("192.168.7.114", 8282);
			System.out.println("서버와 연결 성공");
			String msg = "";
			while(!msg.equals("3")) {
				System.out.println("1.학생리스트 요청 2.학생상세정보 요청 3.종료");
				msg = scanner.next();
				
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				ow.write(msg + "\r\n");
				ow.flush();
				
				
				if(msg.equals("2")) {
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					msg = br.readLine();
					
					System.out.println(msg);
					
					System.out.println("상세 조회할 학생의 번호를 입력하세요");
					msg = scanner.next();
					
					os = socket.getOutputStream();
					ow = new OutputStreamWriter(os);
					ow.write(msg + "\r\n");
					ow.flush();
				}
				
				if (msg.equals("3")) {
					System.out.println("종료");
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					break;
				} else {	
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
				}
				
				
				msg = br.readLine();
				
				
				StringTokenizer st = new StringTokenizer(msg, ",");
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken().trim());
				}	
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ow.close();
				os.close();
				is.close();
				ir.close();
				br.close();
				socket.close();
				scanner.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
}
