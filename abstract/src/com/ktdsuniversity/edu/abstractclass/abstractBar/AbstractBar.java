package com.ktdsuniversity.edu.abstractclass.abstractBar;

import java.util.Random;
import java.util.Scanner;

public abstract class AbstractBar {

	protected int age;
	protected Drink[] drinks;
	protected int wallet;
	protected double BAC; //혈중 알코올 농도(血中 알코올 濃度, Blood Alcohol Content, BAC) - BAC가 뭔지 알려드리기 위해서 작성
	protected int alcoholCount; //

	public AbstractBar() {
		this.drinks = new Drink[4]; // 생성자 선언시 음료가 들어간 배열이 생성됩니다 
		drinks[0] =  new Sodas("펩시라임", "제로탄산" , 1000);
		drinks[1] = new Sodas("코카콜라", "탄산음료" , 1500);
		drinks[2] = new Alcohols("진로", "소주",6000);
		drinks[3] = new Alcohols("테라", "맥주" , 5000);
	}
	
	
	
	public void menu() {
		System.out.println("메뉴판입니다");
		System.out.println("----------------------------------------");
		System.out.println("음료\t타입\t가격");
		for(int i = 0; i<drinks.length ;i++) {
			System.out.println(drinks[i].getName() + "\t" + drinks[i].getTypes() + "\t" + drinks[i].getCost());
		}
		System.out.println("----------------------------------------");
	}
	
	public boolean CheckDrunk() {
		
		Random random = new Random();
		
		if(this.alcoholCount > 2) {
			System.out.println("많이 취하신것 같네요 혈중 알코올 농도 좀 체크하겠습니다");
			
	        double BAC = Math.round(random.nextDouble() * 100) / 100.0; // 혈중알코올농도를 0~1사이 숫자로 난수를 출력한다
	        
			if(BAC > 0.5 ) {
				System.out.println(BAC + " 퍼센트 ? 많이 취하셨네...나가세요");
				return false;
			}else {
				System.out.println(BAC + " 퍼센트시네 더 드세요");
			}
			
		}return true;
	}
	
	public void sale(int choice) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		if (drinks[choice] instanceof Alcohols) {
			
			if (this.isAdult()) {
				this.wallet += drinks[choice].getCost();
				this.alcoholCount += 1;
				System.out.println("여깃습니당 맛있게 드세요~");
				System.out.println("----------------------------------------");

			} else {
				getOut();
			} // 신분증검사

		} else {
			this.wallet += drinks[choice].getCost();
			System.out.println("주문하신 음료 나왔습니다 맛있게 드세요~");
			System.out.println("----------------------------------------");

		}

	}
	
	public abstract boolean isAdult();
	
	public abstract void getOut();
	
	
	
	
	
	
	
	
	
	
	
	
	public void totalSales() {
		System.out.println("오늘 매출은 " + getWallet() + " 입니다");
	}

	public int getWallet() {
		return this.wallet;
	}
	

	
	


	
	
	
}
