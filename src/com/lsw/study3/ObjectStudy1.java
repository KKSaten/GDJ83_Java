package com.lsw.study3;

import com.lsw.study3.student.Student;

public class ObjectStudy1 {
	
	public static void main(String [] args) {
		
		StudyReturn sr = new StudyReturn();
		int result = sr.t1();
		
		int n = sr.t1();
		
//		//학생 객체 생성
//		// new 클래스명() -> 객체의 주소가 반환
//		Student s = new Student();
//		s.num = 2;
//		s.name = "iu";
//		
//		System.out.println(s);
//		System.out.println(s.name);
//		System.out.println(s.kor);
//		
//		Student s2 = new Student();
//		System.out.println(s2.name);
//		
//		Student s3 = null;
//		s3 = s;
//		System.out.println(s3.name);
//		s3.name = "winter";
//		System.out.println(s.name); //heap영역의 객체를 가리키는 s의 주소지를 s3에 그대로 넣었으니
//		 							//같은 객체를 바라보게 되어 이렇게 되는 것. 이를 얕은 복사라고 함
//		
//		Student s4 = new Student();
//		s4.num = s.num;
//		s4.name = s.name;
//		System.out.println(s4.name);
//		s4.name="hani";
//		System.out.println(s.name); //주소를 담은 것이 아니라 객체 안의 요소를 그대로 넣었으니
//									//서로 다른 주소를 가지고 있고 서로 다른 객체이지만
//									//그 안에 담긴 데이터 값이 같은 것. 이를 깊은 복사라고 함.
//		
//		
//		//멤버메서드 호출
//		//참조변수명.메서드명();
//		//멤버변수 사용
//		//참조변수명.멤버변수명
//		s.info();
//		s.info();
		
	}

}
