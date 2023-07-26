package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack snack = new Snack();
	
	// 기본 생성자 
	public SnackController() {
		
	}
	
	
	// 메소드 생성자
	 public String saveData(String kind, String name, String flavor, int numOf, int price) {
	
		 snack.setKind(kind);
		 snack.setName(name);
		 snack.setFlavor(flavor);
		 snack.setNumOf(numOf);
		 snack.setPrice(price);
 
		 return "저장 완료되었습니다.";
	 }
	 
	 
	public String confirmData() {

		return snack.information(); /*(snack.getKind() + "(" + snack.getName() + " - " + snack.getFlavor() + ") "+snack.getNumOf()+"개 "+ snack.getPrice()+"원") ;*/
	}
}
