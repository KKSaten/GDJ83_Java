package com.lsw.study3.ex1;

public class GameController {
	
	public void start() {
		//몬스터 생성 1마리, 3마리
		MonsterFactory mf = new MonsterFactory();
		Monster mob = mf.createMonster();
		System.out.println(mob.name);
		System.out.println(mob.level);
		
		Monster[] monsters = mf.createMosterGroup();
		
		for(int i=0; i<monsters.length; i++) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].level);
		}
		
		
	}

}
