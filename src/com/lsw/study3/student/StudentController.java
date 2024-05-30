package com.lsw.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		System.out.println("start");
		
		//1.학생정보 입력 2.학생정보 출력 3.학생정보 검색 4.프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		StudentService service = new StudentService();
		StudentView studentView = new StudentView();
		Student[] stds = null;
		
		while(flag) {
			System.out.println("1.학생정보 입력 2.학생정보 출력 3.학생정보 검색 4.프로그램 종료");
			int select = sc.nextInt();
			
			if(select == 1) {//학생정보 입력
				stds = service.make_student();
			}else if(select == 2) {//학생정보 출력
				if (stds != null) {
					studentView.view(stds);
				} else {
					studentView.view("학생 정보를 먼저 입력");
				}
			}else if(select == 3) {
				Student student = service.search_student(stds);
				if (student != null) {
					studentView.view(student);
				} else {
					studentView.view("검색 결과가 없습니다");
				}
			}else if(select == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다");
			}
			
		}//while문 끝
		
	}//메서드 끝
	
}
