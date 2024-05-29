package com.lsw.study3.ex1;

public class Ex_main {
	
	public static void main(String [] args) {
		
		Monster ork = new Monster();
		ork.name = "레드오크";
		ork.species = "오크";
		ork.hp = 8000;
		ork.level = 50;
		ork.exp = 550;
		
		
		Weapon axe = new Weapon();
		axe.name = "한손도끼";
		axe.damage = 150;
		axe.range = 10;
		axe.durability = 45;
		axe.enhancement = 2;
		
		ork.axe = axe;
		
		System.out.println(ork.axe.name); // 주소를 잘 따라가야한다 스택과 힙의 영역을 그림으로 그려서 확인해보자
		
		axe = new Weapon ();
		axe.name = "황금도끼";
		
		System.out.println(ork.axe.name); //황금도끼가 나오지 않고 그대로 한손도끼가 나온다. 잘 생각해보자
		
		
		Monster goblin = new Monster();
		goblin.axe = axe;
		
		
	}

}
