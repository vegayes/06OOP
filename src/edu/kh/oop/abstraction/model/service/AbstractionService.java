package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.*;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스 

// Run class 아님. 
public class AbstractionService {
	
	public void ex1() { 
		// 객체 생성!!
		// 국민 객체 만들기
		
		People p1 = new People();
		
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1을 생성. 
		// new People() : 새로운 People 객체를 Heap 영역에 생성한 것. 

		// ** 클래스 이름이 자료형처럼 사용된다.
		// ==> 그래서 클래스를 "사용자 정의 자료형" 이라고도 한다! ** 

		/*
		p1.name = "홍길동";
		p1.age = 25;
		p1.gender = '남';
		p1.address = "서울시 중구 남대문로 120 대일빌딩 3층 E강의실";
		p1.phone = "010-1234-1234";
		p1.pNo = "123456-1234567";
	
		// public -> private로 바꾸면, The field People.name is not visible
		// 접근 불가의 오류가 발생. 
		*/
		
		p1.setName("홍길동"); // 간접접근
		p1.setAge(25);  
		p1.setGender('남');
		p1.setAddress("서울시 중구 남대문로 120 대일빌딩 3층 E강의실 ");
		p1.setPhone("010-1234-1234"); 
		p1.setpNo("123456-1234567"); 
		// ===========> 메모리 구조 안에 이제 값이 하나씩 들어감. 
		
		System.out.println("p1의 name : " + p1.getName()); // 간접적으로 가져옴. 
		System.out.println("p1의 age : " + p1.getAge());
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 address : " + p1.getAddress());
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 pNo : " + p1.getpNo());
	
		// .으로 접근하는것 :: 직접 접근  ( 정보은닉 X ) 
		// 데이터는 직접 접근하면 안됨. 
		// 지금은 캡슐화 적용X 
		
		
		People p2 = new People();
		
		System.out.println("-".repeat(70));
		
		p2.setName("유은서");
		p2.setAge(23);  
		p2.setGender('여');
		p2.setAddress("서울특별시 구로구 ");
		p2.setPhone("010-1233-1233"); 
		p2.setpNo("123123-1231234"); 
		
		System.out.printf("%s의 name : %s \n", p2.getName(), p2.getName());
		System.out.printf("%s의 age : %s \n", p2.getName(), p2.getAge());
		System.out.printf("%s의 gender : %s \n", p2.getName(), p2.getGender());
		System.out.printf("%s의 address : %s \n", p2.getName(), p2.getAddress());
		System.out.printf("%s의 phone : %s \n", p2.getName(), p2.getPhone());
		System.out.printf("%s의 pNo : %s \n", p2.getName(), p2.getpNo());
		
		
	}
	

	
	
}
