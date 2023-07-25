package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

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
							// static 변수인 것을 알려주기 위해서 옆으로 기울어짐.
		
		// schoolName에 노란줄이 뜨는 이유 ==> 제대로 작성을 안해서
		//  *** static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용함 ***
		System.out.println(Student.schoolName);  // 클래스명 자체에다가 붙음. 
		
		
		Student.schoolName = "KH";  // final 취급하면, 오류남.
		System.out.println("변경 후 : " + Student.schoolName);  // 클래스명 자체에다가 붙음. 
	
		/* static
		 * 
		 * 1) '공유 메모리 영역' (또는 '정적 메모리 영역') 이라고 함.
		 *  why?? 프로그램 시작 시, static이 붙은 코드들이 모두 
		 * static 영역에 생성되고, 프로그램이 종료될 때까지 사라지지 않음. (정적)
		 * 그리고, static 영역에 생성된 변수는 어디서든지 공유 가능. (공유)
		 * 
		 * 2) 사용 방법 : 클래스명.변수명 
		 */

	}
	
	public void ex3() {
		
		// 생성자 확인 테스트
		
		// Student 객체를 기본생성자를 이용해 생성하고 
		// 이를 참조하는 참조변수 s1에 대입함.
		Student s1 = new Student(); 
						// 기본 생성자
		
		// User 기본 생성자를 이용해서 객체 생성
		User user = new User();
		
		
		// User 객체 필드 초기화 확인
		System.out.println(user.getUserId());
		System.out.println(user.getUserPw());
		System.out.println(user.getUserName());
		System.out.println(user.getUserAge());
		System.out.println(user.getUserGender());
		
		
		
		User user2 = new User();

		
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserPw());
		System.out.println(user2.getUserName());
		System.out.println(user2.getUserAge());
		System.out.println(user2.getUserGender());
		
		// 문제점 :: u1이 참조하고 있는 User객체와 
		// 			 u2가 참조하고 있는 User객체의 필드 값이 모두 동일함
		// 			 왜 ? 같은 기본 생성자로 User 객체를 생성했기 때문에
		
		System.out.println("-".repeat(80));
		
		//해결 방법 1 : setter를 이용해서 새로운 값 대입
		user2.setUserId("abcde"); //괄호 안에 있는 값이 매개변수 
		user2.setUserPw("ddddlkjfslk");
		user2.setUserName("유은서");
		user2.setUserAge(23);
		user2.setUserGender('여');
		
		System.out.println(user2.getUserId()); 
		System.out.println(user2.getUserPw());
		System.out.println(user2.getUserName());
		System.out.println(user2.getUserAge());
		System.out.println(user2.getUserGender());
		
		
		//해결 방법 2 : 매개변수 생성자를 이용해서 객체가 생성될 때 부터 다른값으로 필드를 초기화
		
		User user3 = new User("test3", "password3333");	 // 매개변수 생성자 
					 // 생성자 수행 시 전달할 값을 작성( 순서 꼭 지켜야함! ) 
		
		System.out.println(user3.getUserId());  // null 값이 나옴!  
		System.out.println(user3.getUserPw());
		// getter는 필드에 저장된 값을 가져와줌
		
	}
	
	// 클래스를 만들면, => 기본 생성자, 매개변수 생성자
	// 접근 제한자 외의 값을 만들기 위해서는 => getter, setter 만들어야 함. 
	
	
	public void ex4() { // 매개변수 생성자 예제
		
		User u1 = new User();// 기본 생성자
		
		User u2 = new User("abcd","1234"); // 매개변수 생성자 ( 아이디, 패스워드 ) 
		
		User u3 = new User("user03", "12345", "김용기",30,'남'); // 매개변수 5개 생성자
		
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", u1.getUserId(), u1.getUserPw(), u1.getUserName(), u1.getUserAge(), u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", u2.getUserId(), u2.getUserPw(), u2.getUserName(), u2.getUserAge(), u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", u3.getUserId(), u3.getUserPw(), u3.getUserName(), u3.getUserAge(), u3.getUserGender());
		//  char :: '' 형태로 비어있음을 표현함.
		
		
		
		
	}
	
	
	
	
	
	
	

}
