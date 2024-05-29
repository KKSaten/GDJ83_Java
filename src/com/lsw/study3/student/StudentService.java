package com.lsw.study3.student;

import java.util.Scanner;

public class StudentService {
	
	public Student[] make_student() {//학생정보 입력

		Scanner sc = new Scanner(System.in);
		
		//같은 데이터 타입을 묶는 것
		System.out.println("학생의 수를 입력하세요");
		int count = sc.nextInt();

		//학생들을 모을 배열을 리턴
		//Student
		//배열
		Student[] stds = new Student[count];
		
		for(int i=0; i<stds.length; i++) {
			//stds[i] = new Student();
			Student s = new Student();
			System.out.println("학생의 이름을 입력하세요");
			s.name = sc.next();
			System.out.println("학생의 번호를 입력하세요");
			s.num = sc.nextInt();
			System.out.println("국어 성적을 입력하세요");
			s.kor = sc.nextInt();
			System.out.println("영어 성적을 입력하세요");
			s.eng = sc.nextInt();
			System.out.println("수학 성적을 입력하세요");
			s.math = sc.nextInt();
			s.totals = s.kor + s.eng + s.math;
			s.avgs = s.totals / 3.0;
			
			stds[i] = s;
		}	
		return stds;
	}//학생정보 입력
		
	
	public void print_student() {//학생정보 출력
		
		
		System.out.println();
		
		
	}//학생정보 출력

}
