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

public class CartoonCafe {

	private int wallet;

	private Cartoon sport;
	private Cartoon comic;
	private Cartoon horror;
	private Cartoon family;

	public CartoonCafe(Cartoon sport, Cartoon comic, Cartoon horror, Cartoon family) {
		super();
		this.sport = sport;
		this.comic = comic;
		this.horror = horror;
		this.family = family;
	}

	public CartoonCafe(int wallet) {
		this.wallet = wallet;
	}

	public void rental(Cartoon comics , CartoonCafe wallet) {
		if (comics.isHasBook()) {
			comics.setHasBook(false);
			wallet.setWallet(wallet.getWallet() + comics.getCost());
			System.out.println(comics.getTitle() + " 가 대여되었습니다");
		} else {
			System.out.println("도서에 재고가 없습니다.");
		}

	}

	
	
	
	public Cartoon getSport() {
		return sport;
	}

	public void setSport(Cartoon sport) {
		this.sport = sport;
	}

	public Cartoon getComic() {
		return comic;
	}

	public void setComic(Cartoon comic) {
		this.comic = comic;
	}

	public Cartoon getHorror() {
		return horror;
	}

	public void setHorror(Cartoon horror) {
		this.horror = horror;
	}

	public Cartoon getFamily() {
		return family;
	}

	public void setFamily(Cartoon family) {
		this.family = family;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

}
