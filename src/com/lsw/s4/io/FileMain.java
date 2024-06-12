package com.lsw.s4.io;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		// 파일의 정보를 담고있는 객체가 필요
		File file = new File("C:\\study"); // C:\study가 아니라 역슬래시가 두개 들어가는 이유는 \n, \t 같은 문법때문에 구별을 위해서
		
		System.out.println(file.exists()); //파일의 존재여부 확인 //is로 시작하면 보통 다 boolean 타입을 묻는 것
		System.out.println(file.isDirectory()); //폴더가 맞는지 확인
		System.out.println(file.isFile()); //파일이 맞는지 확인
		System.out.println(file.getName());
		System.out.println(file.length()); //용량 확인
		
//		file = new File("C:\\study", "test.txt"); // 앞에 넣는 것은 폴더 그 뒤에 있는 것은 그 하위
//		file = new File(file, "test.txt"); // 맨 위에서 file에 C:\\study가 들어갔으므로 바로 위줄과 동일한 결과
		
		file = new File(file, "sub");
		if(!file.exists()) { //없으면
			file.mkdir(); //해당 경로에 sub라는 폴더가 생성됨
		}
		
		
		file = new File("C:\\study\\sub2\\student");
		file.mkdir(); // 이건 만들어지지 않았음. 왜냐면 student라는 폴더를 만들라고 명령을 내린 것인데
					  // 부모폴더인 sub2도 존재하지 않기 때문에
		file.mkdirs();// 요걸 써야 부모폴더까지 한번에 만들어짐
		
		
		
		file = new File("C:\\study\\test.txt");
		file.delete(); //파일 삭제
		
		file = new File("C:\\study\\sub");
		file.delete(); //폴더도 삭제 가능(빈폴더만)		
		
		file = new File("C:\\study");
		String[] list = file.list();
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);			
		} //폴더 안의 파일,폴더들이 쭉 나옴
		
		
		File[] files = file.listFiles();
		for(File f : files) {
			if(f.isDirectory()) {
				System.out.println("Folder");
			}
			else {				
				System.out.println("File");
			}
		}
		
		
		
	}//main 끝

}
