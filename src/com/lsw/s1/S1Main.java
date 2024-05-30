package com.lsw.s1;

import java.util.Scanner;
import com.lsw.s2.Korea;
import com.lsw.s2.Member;
//import com.lsw.s3.Member; //이건 안된다


//스캐너도 이렇게 불러왔었지
//결국 이게 뭐다? import = 수입
//불러오라 이거지

public class S1Main {
	
	public static void main(String[] args) {
		Test test = new Test();
		test.num = 10;
		test.name = "abc"; //같은 패키지 안에 있으니 접근 가능. 따로 적지 않으면 기본적으로 default
		//test.price = 500; //private을 달았으므로 같은 클래스 내에서만 사용가능하므로 접근이 불가
		
		Korea korea = new Korea(); //Korea가 public이므로 패키지가 달라도 불러 올 수 있었다 물론 맨 위에 import 해줘야함
//		korea.name = ""; // 근데 얘는 디폴트라 가져올 수 없음
		//ctrl + space 입력하면 자동완성 뜬다
		
		korea.setPop(20); //앞으로 private을 걸고 이렇게 사용해야한다
		System.out.println();
		
		
		
		
		
	}

}
