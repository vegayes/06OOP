package edu.kh.oop.cls.model.vo;

public class User {
	
	// 속성 ( == 필드 ) 
	// 아이디, 비밀번호, 이름 , 나이, 성별 (추상화 진행)
	// 데이터 직접접근 불가원칙 => 필드는 기본적으로 모두 private( 캡슐화 진행 )
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	
	// 기능 ( == 생성자 + 메서드 ) 
	
	// * 생성자 :: new 연산자를 통해서 객체가 생성될 때, 
	// 			 생성된 객체의 필드값 초기화 + 기능 수행 역할.
	
	
	// 기본 생성자
	public User() {
		// 기능 수행 역할 가능		
		System.out.println("기본 생성자로 User 객체 생성 ");
		
		// 필드 초기화
		userId = "user01"; 
		userPw = "pass01";
		userName = "홍길동";
		userAge = 23;
		userGender = '남';
		
		// 기본 생성자를 이용해서 User 객체를 만들면
		// 그 객체는 프린터 구문을 수행하고,
		// 필드 초기화 구문을 거쳐서 홍길동 하나가 만들어짐
	}


	// 캡슐화로 인한 간접 접근 기능(getter/setter)

	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserPw() {
		return userPw;
	}



	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getUserAge() {
		return userAge;
	}



	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}



	public char getUserGender() {
		return userGender;
	}



	public void setUserGender(char userGender) {
		this.userGender = userGender;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
