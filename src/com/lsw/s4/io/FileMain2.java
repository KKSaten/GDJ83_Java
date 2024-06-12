package com.lsw.s4.io;

import java.io.File;

public class FileMain2 {
	
	public static void main(String[] args) {
		//study2 폴더를 삭제
		//내용물이 지워져야 삭제가 가능하겠지?
		
		File file = new File("C:\\study2");
		File[] files = file.listFiles();
		
		for(File f : files) {
			f.delete();
		}
//		for(int i=0; i<files.length; i++) {
//			file = new File(files[i].toString());
//			file.delete();
//		}
//		file = new File("C:\\study2");
		file.delete();
		
		
	}

}
