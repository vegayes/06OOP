package edu.kh.oop.practice.model.vo;

public class Hero {
	
	private String job ; // 직업 이름
	private int hp ; // 직업 이름
	private int mp ; // 직업 이름
	private char gender ; // 직업 이름
	private int level ; // 직업 이름
	
	public Hero(){

	}
	
	public void attack() {
		System.out.printf("%s가 기본 공격을 했다 (-150)",job);
		
	}
	
	public void jump() {
		
		System.out.printf("%s의 점프!",job);
		
		
		
	}

	
	// geeter / setter
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	

}
