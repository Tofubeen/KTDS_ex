package com.ktdsuniversity.edu.lesson.staticexam.Quest.cartoon;

/*
 * 정보은닉 + 캡슐화 연습문제
	만화카페 구현해보기.
	만화카페는 다양한 만화책을 구비해놓고 있습니다.
	만화책을 관리하기 위해 아래 정보를 관리하고 있습니다.
	만화책 이름
	예. 슬램덩크 1화, 슬램덩크 2화
	만화책 대여 상태
	예. true: 대여 중, false: 대여안함
	만화책 대여비
	소지금(만화카페)
	만화책을 대여하면, 만화책의 대여 상태가 “대여 중“ 으로 변환되며 만화책 대여비만큼 소지금이 증가합니다.
 */



public class CartoonCafeMain {

	static final int MONEY = 10000;
	
	
	public static void main(String[] args) {
		
		Cartoon basketBall = new Cartoon("슬램덩크", true, 1000);
		Cartoon jjangGu = new Cartoon("짱구", true, 1000);
		Cartoon parasyte = new Cartoon("기생수", false, 2000);
		Cartoon mindFamily = new Cartoon("마음의소리", true, 500);
		
		CartoonCafe books = new CartoonCafe(basketBall, jjangGu, parasyte, mindFamily);
		CartoonCafe wallet = new CartoonCafe(MONEY);
		
		
		System.out.println("처음 보유금액: " + wallet.getWallet());
		books.rental(basketBall, wallet);
		books.rental(parasyte, wallet);
		
		
		System.out.println("만화책 이름 : \t" + basketBall.getTitle() + "\t" +jjangGu.getTitle() + "\t" + 
		parasyte.getTitle() + "\t" + mindFamily.getTitle());
		System.out.println("대여상태 : \t" 
                + (basketBall.isHasBook() ? "대여 중" : "대여 가능") + "\t" 
                + (jjangGu.isHasBook() ? "대여 중" : "대여 가능") + "\t" 
                + (parasyte.isHasBook() ? "대여 중" : "대여 가능") + "\t" 
                + (mindFamily.isHasBook() ? "대여 중" : "대여 가능"));
		System.out.println("만화책 대여비 : \t" + basketBall.getCost() + "\t" +jjangGu.getCost() + "\t" + 
				parasyte.getCost() + "\t" + mindFamily.getCost());
		System.out.println("현재 보유 금고금액: " + wallet.getWallet());
	}
	
}
