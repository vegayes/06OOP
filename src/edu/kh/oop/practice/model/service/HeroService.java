package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
	
		Hero hero1 = new Hero();
		Hero hero2 = new Hero();
		Hero hero3 = new Hero();
		
		
		hero1.setJob("워리어");
		hero1.setHp(18000);
		hero1.setMp(5000);
		hero1.setGender('남');
		hero1.setLevel(5);
		
		hero2.setJob("마법사");
		hero2.setHp(5000);
		hero2.setMp(25000);
		hero2.setGender('여');
		hero2.setLevel(2);
		
		
		
		hero3.setJob("힐러");
		hero3.setHp(10000);
		hero3.setMp(50000);
		hero3.setGender('남');
		hero3.setLevel(10);
		
		
		System.out.println("직업 : " +hero1.getJob());
		System.out.println("hp : " +hero1.getHp());
		System.out.println("mp : " +hero1.getMp());
		System.out.println("성별 : " +hero1.getGender());
		System.out.println("현재 레벨은 " +hero1.getLevel()+" 입니다.");
		
		System.out.println();
				
		System.out.println("직업 : " +hero2.getJob());
		System.out.println("hp : " +hero2.getHp());
		System.out.println("mp : " +hero2.getMp());
		System.out.println("성별 : " +hero2.getGender());
		System.out.println("현재 레벨은 " +hero2.getLevel()+ " 입니다.");
		
		System.out.println();
		System.out.println("\n"+"=".repeat(70));
		System.out.println();
		
		hero2.attack();
		
		System.out.println("\n");
		
		
		hero1.setHp(18000-150);
		
		System.out.println("직업 : " +hero1.getJob());
		System.out.println("hp : " +hero1.getHp());
		System.out.println("mp : " +hero1.getMp());
		System.out.println("성별 : " +hero1.getGender());
		System.out.println("현재 레벨은 " +hero1.getLevel()+" 입니다.");
		
		System.out.println();

		
		System.out.println("=".repeat(70));
		System.out.println("직업 : " +hero3.getJob());
		System.out.println("hp : " +hero3.getHp());
		System.out.println("mp : " +hero3.getMp());
		System.out.println("성별 : " +hero3.getGender());
		System.out.println("현재 레벨은 " +hero3.getLevel()+" 입니다.");
		System.out.println();
		hero3.jump();

	}
	
}
