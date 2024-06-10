package com.lsw.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try { //try문은 하나 catch문은 여럿 사용 가능
			int num = 10;
			
			System.out.println("숫자 입력");
			int num2 = sc.nextInt();
			
			System.out.println(num / num2);
			//throw new ArithmeticException(); 개념 설명을 위해 적어둔 것이고 생략해도 됨			
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch(InputMismatchException e) { //여기 들어가는 Arith어쩌구 Input어쩌구는 실제로 예외가 발생했을 때 뭘 써야할지 콘솔에 뜸
			System.out.println("숫자 이외에는 입력하지 마세요");
		} catch(Exception e) { //어우 종류가 너무 많네? 다형성을 이용해서 부모클래스 데려와서 다 때려박아
			
		} catch(Throwable e) { //Exception으로도 안잡혀? 그 부모도 데려와 ㅋㅋ
			
		}//try catch문 끝
		
		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(5);
		} catch (ArithmeticException e) {
			e.printStackTrace(); //이녀석을 안쓰고 print로 그냥 예외발생했다고 출력시키만 하면
			//어디서 문제가 생겼는지 알 수가 없음. 개발할 때 이러면 욕처먹음
			System.out.println(e.getMessage());//이렇게 '왜' 문제가 발생했는지는 출력가능 '어디서'인지는 출력 안됨
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 종료");//정상적으로 프로그램이 돌아가면 얘가 출력되어야함
		//그런데 num2를 입력받을 때 0을 입력하면 0으로 나눌 수 없으므로 (혹은 숫자가 아닌 문자를 입력한다거나)
		//에러가 뜨면서 프로그램 종료 문구가 출력되기 전에 해당 코드에서 그 즉시 프로그램이 종료됨
		//이처럼 컴파일의 오류는 없지만 프로그램의 실행중에 일어난 에러를 exception(예외)라고 함
		//이런것을 방지하기 위해서 위에서처럼 try~catch문을 이용하여 예외처리를 해줘야한다.
		
		
	}//main 끝

}
