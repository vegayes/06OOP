package edu.kh.oop.cls.model.vo;

class TestVO /* extends Student */ {

// 접근제한자 (default) : 같은 패키지내에서만 import가 가능함을 나타냄. 
	
	// 접근 제한자 예제
	// 2) 같은 패키지 안 클래스 
	// Student와 같은 패키지에 있기 때문에 
	// -> public, protected, (default) 3개는 접근 가능 
	public void ex() {
		
		Student student = new Student();
		
		System.out.println(student.v1);
		System.out.println(student.v2);
		System.out.println(student.v3);
//		System.out.println(student.v4); // 접근제한자가 private이기 때문에 에러. 
		// 단, v4는 private이기 때문에 같은 패키지라도
		// 다른 클래스에서 직접 접근 불가
		
//		System.out.println(v3);
		// 상속 받은 경우. v3도 인증 가능
		
	}
	
	
	
	

}
