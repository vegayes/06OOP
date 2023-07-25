package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		Book book = new Book();
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		Book book2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		System.out.println(book.toString());
		System.out.println(book2.toString());
		
		System.out.println("=".repeat(40));
		
		System.out.println("수정된 결과 확인");
		
		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력
		System.out.println(book.toString());
		
		System.out.println("=".repeat(40));
		
		
		System.out.printf("도서명 = %s\n", book.getTitle() );
		System.out.printf("할인된 가격 = %d원\n", (int) book.getPrice()-(int)(book.getPrice()*book.getDiscountRate()) );

		System.out.printf("도서명 = %s\n", book2.getTitle() );
		System.out.printf("할인된 가격 = %d원\n", (int)book2.getPrice()-(int)(book2.getPrice()*book2.getDiscountRate()) );

		
		
	}
	
	

}
