package edu.kh.oop.method.model.vo;

public class Member {
	
	// 필드
		
	// 아이디 
	// 비밀번호
	// 이름
	// 나이		
	private String memberId ;
	private String memberPw ;
	private String memberName ;
	private int memberAge ;
	
	// 기본 생성자
	// 기본 생성자 규칙 : 반환형이 없고, 클래스와 이름이 같아야 함.
	public Member() {
		
//		System.out.println("나는 기본 생성자");
	}
	
	// 매개변수 생성자 ( 필드 모두 초기화 )
	// alt + shift + s  --> Constructor using field
	
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// 오버로딩 적용(매개변수의 개수가 다름) 
		
//		System.out.println("나는 매개변수 생성자");
		
		//매개변수로 전달받은 값을 필드로 대입시키기
		this.memberId = memberId ;  // 매개변수 생성자는 this가 있어야 함! 
		this.memberPw = memberPw;
		this.memberName = memberName ;
		this.memberAge =  memberAge;
		
		
		//?? 처음에 초기화를 아예 시켜버렸는데도 인식 가능한 이유?
	}

	
	// 메서드 (getter / setter 포함)
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		
		return memberPw;
	}
	
	public void setMemberPw(String memberPw) {
		
		this.memberPw=memberPw;
	}

	public String getMemberName() {
		
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		
		this.memberName=memberName;
	}

	public int getMemberAge() {
		
		return memberAge;
	}
	
	public void setMemberAge(int memberAge) {
		
		this.memberAge= memberAge;
	}

}
