package com.lsw.study1;

import java.util.Scanner;

public class Study9 {
	
	public static void main(String [] args) {
		
		//로그인 검증
		//id = 1234, pw = 5678
		
		//로그인 시도 전에 1. 로그인 2. 종료(id,pw잃어버림)
		//사용자의 id와 pw를 입력받아 로그인 시도를 N번 시도
		//틀리면 로그인 실패 출력 및 로그인,종료 선택으로 되돌아가기
		//로그인 성공하면 로그인 성공 출력 후 반복문 종료, 게임 시작
		
		//MMORPG :
		//레벨은 1로 시작 만렙은 15
		//몬스터의 경험치는 모두가 동일하다
		//1 -> 2레벨로 레벨업에 필요한 경험치 요구량 = 몬스터 3마리
		//2 -> 3레벨 : 6마리
		//3 -> 4레벨 : 9마리
		//... 14 -> 15레벨 : 42마리
		//소지 Gold : 0으로 시작
		//5레벨 달성시 1,000G 지급
		//10레벨 달성시 2,000G 지급
		//15레벨 만렙 달성시 3,000G 지급
		
		//종료시 현재 레벨, 현재 Gold 출력 후 종료
		
		int login_id = 1234;
		int login_pw = 5678;
		boolean login = false;
		int select = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(!login) {//반복문(로그인)
			System.out.println("1.로그인 2.종료 입력 : ");
			select = sc.nextInt();
			if(select == 1) {//로그인 성공 케이스
				System.out.println("ID를 입력해주세요 : ");
				int id = sc.nextInt();	
				System.out.println("PW를 입력해주세요 : ");
				int pw = sc.nextInt();
				if (id == login_id && pw == login_pw) {
					System.out.println("로그인에 성공하였습니다");
					System.out.println("1.게임 시작 2. 종료 입력: ");
					select = sc.nextInt();
					login = true;
				}//로그인 성공 종료
				else {
					System.out.println("로그인에 실패하였습니다");
				}//로그인 실패
			}//로그인 성공 케이스 종료
			else if (select == 2) {
				System.out.println("종료되었습니다");
				break;
			}//로그인 시도 종료
			else { // 1,2 외에 다른 입력시 출력
				System.out.println("잘못된 입력을 하셨습니다");
			}
		}//while문(로그인) 종료
		
		
		
		if (login == true && select == 1) {//if문(게임 시작)
			System.out.println("게임이 시작됩니다");
			int Gold = 0;
			for(int lv = 1; lv <= 14;) {//반복문(레벨업)
				System.out.println("");
				System.out.println("현재 레벨 : " + lv);
				System.out.println("소지 Gold : " + Gold);
				System.out.println("1.사냥 시작 2. 종료 입력: ");
				select = sc.nextInt();
				if(select == 2) { //사냥x 종료선택
					break;
				}//사냥x 종료선택
				for(int mob = 1; mob <= lv*3; mob++) {//몬스터 사냥
					System.out.println("몬스터 " + mob + "마리를 사냥하셨습니다! + exp");
				}//몬스터 사냥
				lv++;
				System.out.println("+ Lv UP");
				if (lv%5 == 0) { //5레벨 단위 골드 지급
					System.out.println("");
					System.out.println( lv + "레벨을 달성하셨습니다! " + lv*200 + "Gold 지급");
					Gold += lv*200;
					System.out.println("소지 Gold : " + Gold);
				}//5레벨 단위 골드 지급
			}//반복문(레벨업)
			System.out.println("게임이 종료됩니다");
		}//if문(게임 종료)
	}

}
