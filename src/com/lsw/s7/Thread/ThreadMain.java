package com.lsw.s7.Thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		PrintNumber pn = new PrintNumber();
		PrintWord pw = new PrintWord();
		Thread thread = new Thread();
		
		
		pn.start(); //
		thread.start();
		
	}

}
