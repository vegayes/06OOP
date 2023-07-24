package edu.kh.oop.abstraction.model.vo;


// VO(Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

public class People { // 국민(사람) 클래스  ==> 틀만 만들어 놓은 것.
	
	// 클래스란 
	// -> 객체의 특성(속성, 기능)을 정의한 것. 
	// => 객체를 만들기 위한 설계도 
	
	
	// 캡슐화
	// -> 데이터와 기능을 하나로 묶어서 관리하는 기법
	// -> 데이터의 직접적인 접근을 제한 하는 것이 원칙이다. 
	// -> 집적접근을 못하기 때문에 
	//    클래스 내부에 간접 접근 방법을 제공하는 기능을 작성해둔다. 
	
	
	// 속성 == 값 == data 
	// 값을 저장하기 위한 변수를 선언하는 것
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성할 것. (추상화) 
	//  ex) 이름, 성별, 주민번호, 주소, 전화번호, 나이  등.. 
	
	// 필드 == 필드 변수 == 멤버 변수 == 클래스 변수 
	// :: 클래스 안에 선언된 속성들. 
	
	// public 공공 접근제한자.? 

/*
	public String name;  
	public char gender;
	public String pNo;  // " 123456-1234567"
	public String address;
	public String phone; // " 010-1234-1234"
	public int age;
//	** public double bitCoin; // 공통점이 아니므로 제거 ( 추상화는 공통점으로 가지고 있어야 함.) 

*/
	
	// *** 데이터 직접 접근 제한 ***
	// public(공공의) -> private(사적인, 개인적인) 변경
	private String name;  
	private char gender;
	private String pNo;  // " 123456-1234567"
	private String address;
	private String phone; // " 010-1234-1234"
	private int age;

	
	
	// 기능 == 행동 == method
	public void tax() {
		
		System.out.println("세금을 냅니다.");
	}
	
	public void vote() {
		
		
		System.out.println("투표를 합니다. 꼭하세요!");
	}

	
	// alt + shift + s  /// 상단 메뉴 source 클릭
	// -> Generate Getters and Setters... 클릭
	// -> SelectAll -> generate
	// getter ,  setter 기능을 통해 외부에서 내부로 간접접근 할 수 있음.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 캡슐화에서 사용할 간접 접근 기능(getter / setter) :: 게터, 세터
	// getter : 얻어오는 것
	// setter : 세팅 해야함 !! 
	// 둘은 무조건 같이 있어야 함.. 
	
	/*
	public void setName(String name) { // setter
						// String name :: 매개변수 
		this.name = name; 
					// 가져온 거 :: "홍길동"
		// 필드에 있었던 String name으로 감.
	}
	
	public String getName() { // getter 
		// 반환 자료형 ( retunr될 변수의 자료형을 작성) 
		
		return name;		
		// 현재 저장된 값을 불러옴. 
	}

	
	public void setGender(char gender) {
		
		this.gender = gender;
	}
	
	public char getGender() {
		
		return gender;
	}

	
	public void setAge(int age) {
	
		this.age = age;
	}
	
	public int getAge() {
		
		return age;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		
		return address;
	}

	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		
		return phone;
	}

	
	public void setPNo(String pNo) {
		this.pNo = pNo;
	}
	
	public String getPNo() {
		
		return pNo;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
