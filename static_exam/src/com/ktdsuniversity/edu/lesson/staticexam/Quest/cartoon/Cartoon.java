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


public class Cartoon {
	
	
	private String title;
	private boolean hasBook;
	private int cost;
	
	
	
	public Cartoon(String title, boolean hasBook, int cost) {
		super();
		this.title = title;
		this.hasBook = hasBook;
		this.cost = cost;
		
	}
	
	


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isHasBook() {
		return hasBook;
	}


	public void setHasBook(boolean hasBook) {
		this.hasBook = hasBook;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	
	
	
	
	
	
}
