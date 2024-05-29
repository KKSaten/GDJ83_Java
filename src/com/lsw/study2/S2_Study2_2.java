package com.lsw.study2;

import java.util.Scanner; //키보드로 입력받기

import java.util.Arrays; //배열 정렬하기

public class S2_Study2_2 {
	
	public static void main(String [] args) {
		
		//메모리 영역 구분
		//1.메서드 영역						:클래스변수
		//2.스택 영역:메서드가 실행될 떄 영역	:지역변수
		//3.힙 영역						:인스턴스변수
		
		
		//학생 수를 입력받은 다음 학생 수만큼 이름도 입력받고 국,영,수 점수도 입력받아서 최종 출력
		Scanner sc = new Scanner(System.in);
		
		
		//1.학생 정보 입력, 2.학생정보 출력, 3.프로그램종료
		boolean flag = true;
		String[] names = null;
		int[] kor = null;
		int[] eng = null;
		int[] math = null;
		int[] nums = null;
		int[] totals = null;
		double[] avgs = null;
		
		while(flag) {
			System.out.println("1.학생정보 입력 2.학생정보 출력 3.학생정보 검색 4.성적순 정렬 5.프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
				case 1:						
					System.out.println("학생 수를 입력해주세요");
					int std_nums = sc.nextInt();
					nums = new int[std_nums];
					names = new String[std_nums];
					kor = new int[std_nums];
					eng = new int[std_nums];
					math = new int[std_nums];
					totals = new int[std_nums];
					avgs = new double[std_nums];
					//for(int i=0; i<std_nums 보다는 names.length가 좀 더 정확한 선택
					for(int i=0; i<names.length; i++) {
						nums[i] = i+1;
						System.out.println("학생 이름을 입력해주세요");
						names[i] = sc.next();
						System.out.println("국어 성적을 입력해주세요");
						kor[i] = sc.nextInt();
						System.out.println("영어 성적을 입력해주세요");
						eng[i] = sc.nextInt();
						System.out.println("수학 성적을 입력해주세요");
						math[i] = sc.nextInt();
						totals[i] = kor[i] + eng[i] + math[i];
						avgs[i] = (double)totals[i] / 3.0;
					} //학생 정보 입력
					break;
			
				case 2:
					if (select == 2) { // 학생정보 출력
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
						// \t는 tab만큼 벌리기, \n는 줄바꿈
						for(int i=0; i<names.length; i++) {
							System.out.println(nums[i] + "\t" + names[i] + "\t" + kor[i] + "\t"
									+ eng[i] + "\t" + math[i] + "\t" + totals[i]
											+ "\t" + avgs[i]);								
						}//for문 끝
					}//if문 끝
					break;
					
				case 3:
					System.out.println("검색하고 싶은 학생의 번호를 입력");
					int num_src = sc.nextInt();
					if (num_src > nums.length || num_src < 1) {
						System.out.println("존재하지 않는 학생번호입니다");
						break;
					}
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
					System.out.println(nums[num_src-1] + "\t" + names[num_src-1] + "\t"
							+ kor[num_src-1] + "\t" + eng[num_src-1] + "\t" + math[num_src-1]
							+ "\t" + totals[num_src-1] + "\t" + avgs[num_src-1]);
					
					break;
					
				case 4: 
					//성적순 정렬 만들기
					for(int i=0; i<avgs.length-1; i++) {
						for(int j=0; j<avgs.length; j++) {
							if(avgs[i]<avgs[j]) {
								double memory1 = 0.0;
								memory1 = avgs[i];
								avgs[i] = avgs[j];
								avgs[j] = memory1;
								
								memory1 = nums[i];
								nums[i] = nums[j];
								nums[j] = (int)memory1;
								
								String memory2 = names[i];
								names[i] = names[j];
								names[j] = memory2;
								
								memory1 = kor[i];
								kor[i] = kor[j];
								kor[j] = (int)memory1;
								
								memory1 = eng[i];
								eng[i] = eng[j];
								eng[j] = (int)memory1;
								
								memory1 = math[i];
								math[i] = math[j];
								math[j] = (int)memory1;
								
								memory1 = totals[i];
								totals[i] = totals[j];
								totals[j] = (int)memory1;
							}
						}
					}
				
					break;
				
				case 5:
					System.out.println("프로그램 종료");
					flag = false;
				default:
					System.out.println("잘못된 입력입니다");
			}//switch문 끝
		}//while문 끝
		
		
		
	}
	
	

}
