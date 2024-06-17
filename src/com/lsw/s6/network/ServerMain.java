package com.lsw.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
	
	public static void main(String[] args) {
		// Network
		// ip:port -> Socket
		// Network 통신은 Socket끼리 1:1 통신
		Scanner scanner = new Scanner(System.in);
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		
		try {
			ss = new ServerSocket(8282);
			while(true) { //전체를 반복문을 돌려버리면 클라이언트가 종료되어도 서버는 꺼지지 않고 다시 클라이언트의 접속을 기다림
				//서버를 열고 Client 접속을 기다림
				System.out.println("서버실행 후 클라이언트를 기다림");
				socket = ss.accept();
				System.out.println("client와 연결 성공");
				
				String ending = "";
				while(!ending.equals("exit")) {				
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					
					String msg = br.readLine();
					System.out.println(msg);
					ending = msg.toLowerCase();
					
					if(!ending.equals("exit")) {	
						System.out.println("클라이언트로 보낼 메세지 입력");
						msg = scanner.next();
					} else {
						msg = "exit";
					}
					
					os = socket.getOutputStream();
					ow = new OutputStreamWriter(os);
					ow.write(msg + "\r\n");
					ow.flush();
					ending = msg.toLowerCase();
					
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				socket.close();
				ss.close();
				
				ow.close();
				os.close();
				socket.close();
				scanner.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
