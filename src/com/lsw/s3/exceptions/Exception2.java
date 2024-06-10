package com.lsw.s3.exceptions;

public class Exception2 {
	
	public void plus (int n1, int n2) throws Exception {
		//예외를 일으킬만한 문제가 없는 코드지만
		//어린 애기의 계산을 학습시키기 위한 프로그램을 만들 것이라서
		//3자리수 이상의 숫자 사용을 막으려한다
		//그럼 강제로 예외를 발생시키는 것
		int h = n1 + n2;
		
		if(h>99) {
			throw new MyException("3자리 수는 몰라요");
		}
	}

}
