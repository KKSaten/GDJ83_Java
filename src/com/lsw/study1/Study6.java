package com.lsw.study1;

public class Study6 {
	
	public static void main(String [] argc) {
		
		int total = 256;
		int avg = total/3;
		char result = ' ';
		
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//그 아래 F
		//switch case 사용

		switch(avg/10) {
		case 10: result = 'A'; 
			break;
		case 9: result = 'A'; 
			break;
		case 8: result = 'B';
			break;
		case 7: result = 'C';
			break;
		case 6: result = 'D';
			break;
		default : result = 'F';
		}
		System.out.println(result);
		
		
	}
	
	

}
