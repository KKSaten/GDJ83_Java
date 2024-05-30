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
	}//입력 메서드 끝
		
	
	public void print_student(Student[] stds) {//학생정보 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<stds.length; i++) {
			System.out.println(stds[i].num + "\t" + stds[i].name + "\t" + stds[i].kor
								+ "\t" + stds[i].eng + "\t" + stds[i].math + "\t" + 
								stds[i].totals + "\t" + stds[i].avgs);
		}//for문 끝
		return;
	}//출력 메서드 끝
	
	
	public Student search_student(Student[] stds) {//학생정보 검색
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 번호를 입력해주세요");
		int n = sc.nextInt();
		
		Student student = null;

		for (int i = 0; i < stds.length; i++) {
			if (n == stds[i].num) {
				student = stds[i];
				break;
				// return students[i];
			}//if문 끝
		}//for문 끝

		return student;
	}//검색 메서드 끝
	
	

}
