package com.lsw.s3.exceptions;

public class Exception1 {
	
	public void ex1(int num) throws ArithmeticException, Exception { //예외처리를 직접하는 것이 아니라
																	 //메서드를 호출한 쪽으로 던져버리기
																	 //main에서 이 메서드를 호출했으면
																	 //그쪽 코드에서 try catch를 하던 해서 예외처리 해줘야함
																	 //보통 여럿이서 개발을 하므로 해방 메서드를 사용하는 다른 사람이
																	 //예외처리로 프로그램을 종료시키던, 다시 반복시키던 원하는대로 하게끔
																	 //대부분 이런식으로 던져서 사용함
		int n = 20;
		
		System.out.println(n / num);
		
		
	}

}
