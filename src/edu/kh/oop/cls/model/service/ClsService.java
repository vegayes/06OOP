package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;

//import edu.kh.oop.cls.model.vo.TestVO;
// 오류 :: The type edu.kh.oop.cls.model.vo.Test() is not visible

public class ClsService /* extends Student*/{
						// 부모 Student를 상속받음. 
						// std.v1이 아니라 
						// v1으로 사용할 수 있음. 
	
	public void ex1() {
		
		// 클래스 접근 제한자 확인하기!
		
		Student std = new Student();
		// Student는 접근 제한자를 public으로 설정해두었기 때문에 
		// import가 가능함. 
		
//		TestVO test = new TestVO();
		// test는 접근 제한자를 default로 설정해두었기 때문에 
		// import가 불가함. 
		// ==> 다른 패키지에 존재하기 때문! 
		
		
		// 접근 제한자 예제 
		// 3) 다른 패키지  ==> public을 제외한 나머지는 에러가 남. 
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public만 에러 X 
		
//		System.out.println(std.v2); // 에러
//		System.out.println(std.v3); // 에러
//		System.out.println(std.v4); // 에러
		
		
		// 상속 관계에서 직접 접근 가능 범위
		/*
		System.out.println(v1);
		System.out.println(v2); // 상속받은 자식 클래스에서는 접근 가능. 
		System.out.println(v3); 
		System.out.println(v4);
		*/
	}
	
	
	public void ex2() {
		
		// static 필드 확인 예제
		//학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		// 학생 객체에 name 세팅
		std1.setName("홍길동");
		std2.setName("김영희");
		
		// 정보출력
		System.out.println(std1.schoolName);  // schoolName을 public으로 설정하여, 직접 접근이 가능
							// statice 변수인 것을 알려주기 위해서 옆으로 기울어짐.
		
		// schoolName에 노란줄이 뜨는 이유 ==> 제대로 작성을 안해서
		//  *** static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용함 ***
		System.out.println(Student.schoolName);  // 클래스명 자체에다가 붙음. 
		
		
		Student.schoolName = "KH";
		System.out.println("변경 후 : " + Student.schoolName);  // 클래스명 자체에다가 붙음. 
	
		/* static
		 * 
		 * 1) '공유 메모리 영역' (또는 '정적 메모리 영역') 이라고 함.
		 *  why?? 프로그램 시작 시, static이 붙은 코드들이 모두 
		 * static 영역에 생성되고, 프로그램이 종료될 때까지 사라지지 않음. (정적)
		 * 그리고, static 영역에 생성된 변수는 어디서든지 공유 가능. (공유)
		 * 
		 * 2) 사용 방법 : 클래스명.변수명 
		 * 
		 * 
		 * 
		 */
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
