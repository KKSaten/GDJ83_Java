package com.lsw.s6.network.ex1.client;

public class ClientMain {

	public static void main(String[] args) {
		
		ClientConnect clientConnect = new ClientConnect();
		ClientService clientService = new ClientService();
		
		try {
			clientConnect.getConnection();
			String info = "0, test, 70, 80, 90, 240, 80";
			clientService.getInfo(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
