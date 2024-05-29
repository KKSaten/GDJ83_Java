package com.lsw.study3.ex1;

import java.util.Random;

public class MonsterFactory {
	
	public Monster createMonster() {//몬스터 한마리 생성
		Monster mob = new Monster();
		
		return mob;
	}//몬스터 한마리 생성
	
	public Monster[] createMosterGroup() {//몬스터 여러마리 생성
		Random random = new Random();
		int count = random.nextInt(5)+2;
		
		Monster[] monsters = new Monster[count];
		
		for(int i=0; i<count; i++) {
			Monster mob = new Monster();
			monsters[i] = mob;
		}
		
		return monsters;
	}//몬스터 여러마리 생성

}
