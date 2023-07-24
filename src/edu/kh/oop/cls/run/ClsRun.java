package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;

public class ClsRun {

	public static void main(String[] args) {
		
		ClsService cs1 = new ClsService();
		// 매개변수가 아무것도 없는 생성자는 기본 생성자라고 함.
		// ClsService의 기본 생성자가 작성되어 있지는 않지만, 
		// 문제 없이 사용 가능하다.
		// => 컴파일러가 코드를 번역시(JVM)
		//    클래스 내붕레 생성자가 하나도 없다면
		//    자동으로 기본 생성자를 추가해줌. ( 우리 눈에는 안보임 )
		// => 단, 매개변수 생성자가 만들어져 있으면 기본 생성자가 안 만들어짐. 
		
		
//		cs1.ex2();
		cs1.ex3();
		
		
	}
	
	
}
