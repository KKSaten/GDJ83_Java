package com.lsw.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		
		try {
			socket = new Socket("192.168.7.114", 8282);
			System.out.println("서버와 연결 성공");
			
			String ending = "";
			while(!ending.equals("exit")) {				
				System.out.println("서버로 보낼 메세지 입력");
				String msg = sc.next();
				
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);
				ow.write(msg + "\r\n");
				ow.flush();
				ending = msg.toLowerCase();
				
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				msg = br.readLine();
				System.out.println(msg);
				ending = msg.toLowerCase();

			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally  {
			try {
				ow.close();
				os.close();
				is.close();
				ir.close();
				br.close();
				socket.close();
				sc.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		

	}

}
