package com.lsw.s2;

public class Member {
	
	private String name;
	private int age;
	//근데 이거 왜 쓸까 외부에서 접근이 안되면 뭘 할 수가 없는데
	
	//이렇게 메서드의 매개변수를 통해서 간접적으로 넣어서 쓴다
	//setter, getter 메서드라고 부른다
	public void setAge(int age) {	
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	//그럼 왜 이렇게 쓸까?
	//예를 들어 앞서 만든 학생들 성적 관리를 보면
	//영어 성적이 100점을 넘길 순 없다
	//근데 잘못 입력해서 뭐 1500점을 넣는다던가 할 수도 있는 것을 방지하기 위해서 사용한다
	//public void setAge(int age) {
	//	여기서 if문 사용
	//}
	// 이런식으로.
	
	
	
	

}
