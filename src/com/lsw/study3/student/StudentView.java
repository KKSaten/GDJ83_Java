package com.lsw.study3.student;

public class StudentView {
	
	//메서드 오버로딩
	
	public void view(String str) {
		System.out.println(str);
	}

	public void view(Student student) {
		System.out.println(student.num);
		System.out.println(student.name);
	}

	public void view(Student[] students) {
		// 학생들의 모든 정보 출력
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println(student.num);
			System.out.println(students[i].name);
		}

	}

}
