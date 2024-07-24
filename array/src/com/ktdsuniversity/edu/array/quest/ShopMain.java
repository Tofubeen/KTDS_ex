package com.ktdsuniversity.edu.array.quest;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		
		System.out.println("쇼핑몰 프로그램을 시작합니다.");
		Seller sel = new Seller(); //기본생성자를 호출하며 상품에 대한 정보를 입력합니다
		
		System.out.println("현재 입고된 상품들입니다");
		sel.printGoods(); //상품 재고 출력
		
		System.out.println("상품을 구매합니다");
		sel.sale(); //상품구매 메소드
		
		System.out.println("프로그램을 종료합니다");
		
		
	}
	
}
