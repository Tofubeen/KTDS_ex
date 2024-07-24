package com.ktdsuniversity.edu.array.quest;


/*
 * 배열 실습문제

	상품클래스와 배열을 이용해 쇼핑몰 판매자 기능 구현해보기
	상품클래스(데이터 클래스) 속성
	상품명: String
	상품가격: int
	재고 수: int
	
	판매자 클래스 속성
	상품클래스 배열: 상품[]
	
	판매자 클래스 기능
	판매(상품명, 주문수량): void
	
	상품클래스 배열에서 상품명을 찾아 주문수량만큼 재고 감소시키기
	주문수량이 재고수보다 크거나 
	재고수가 0이라면 “판매할 수 없습니다“ 출력하기	

 */

public class Product {
	
	private String name;
	private int price;
	private int quantity;
	
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public String getName() {
		return this.name;
	}




	public int getPrice() {
		return this.price;
	}



	public int getQuantity() {
		return this.quantity;
	}



	
	
	
	
	

	
}
