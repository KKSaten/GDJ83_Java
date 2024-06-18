package com.lsw.s6.network.ex1.client;

import java.util.Scanner;

public class ClientController {
	
	private ClientConnect clientConnect;
	private ClientService clientService;
	
	public ClientController() {
		clientConnect = new ClientConnect();
		clientService = new ClientService();
	}

	
	
	
	public void start() throws Exception{
		//접속을 하고
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		clientConnect.getConnection();
		
		while(flag) {
			System.out.println("1.학생리스트 조회 2.학생상세정보 조회 3.종료");
			int select = scanner.nextInt();
			
			if (select == 1) {
				clientConnect.getOw().write(select + "\r\n");
				clientConnect.getOw().flush();
				
				String info = clientConnect.getBr().readLine();
				
				clientService.getInfo(info);
				
			} else if (select == 2) {
				
			} else {
				
			}
			
			
			
		}
		
	}
	
	
	

}
