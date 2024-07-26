package com.ktdsuniversity.edu.abstractclass.abstractBar;

import java.util.Scanner;

public class BarMain {

	public static void main(String[] args) {

		
		AbstractBar ab = new AbstractBar() {
			
			@Override
			public boolean isAdult() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void getOut() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		
		/*
		 * Drink 클래스를 상속받는 Sodas 와 Alcohols는 내부 구성은 동일합니다 그렇게 구성한 이유는 메뉴를 주문할때
		 * instanceof 연산자를 이용해 주류주문과 탄산음료 주문을 구별하기 위해서 나눠봤습니다
		 */

		Scanner sc = new Scanner(System.in);
		
		AbstractBar bar = new WhiskiBar();
		
		
		System.out.println("환영합니다");

		while (true) { // 메뉴선택과 주문을 무한반복하고 0~3은 음료를 주문하며 4를 입력할시 가게를 빠져나오며 프로그램은 종료됩니다

			bar.menu(); // 메뉴판 출력 메소드

			System.out.print("음료는 뭘로 드릴까요? 메뉴는 (0~3) , 가게를 나올려면 4를 입력해주세요");

			int choice = sc.nextInt(); // 주문할 번호

			if (choice == 4) { // 4번 입력시 가게에서 빠져나온다
				System.out.println("안녕히 가세요");
				break;

			} else {
				bar.sale(choice); // 선택한 음료를 판매하는 메소드
				boolean check = bar.CheckDrunk(); // 취한정도를 판별하는 메소드

				if (!check) {
					break;
				}
			}

		}

		bar.totalSales(); // 총 매출액을 출력하는 메소드

		System.out.println("영업을 종료합니다");

	}
}
