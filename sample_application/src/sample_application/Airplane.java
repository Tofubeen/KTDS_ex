package sample_application;

import java.util.Scanner;

public class Airplane {

	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("guide : 항공권 계산을 하지않고 비행여부를 체크 선택시 관련정보가 없어 에러가 표시됩니다 필히 계산 후 체크해주세요");
			System.out.println("1.항공권 계산");
			System.out.println("2.비행여부 체크");
			System.out.println("3.끝내기");
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			
			if(choice == 1) {
				
				price = cal();
				

			}
			
			if(choice == 2) {
				if(price == 0) {
					System.out.println("항공권 계산 후 체크 가능합니다");
					continue;
				} else {
					System.out.print("자본금을 입력해주세요");
					int money = sc.nextInt();
					
					if(money > price) {
						System.out.println("여행이 가능합니다");
					}else {
						System.out.println("죄송합니다 , 여행이 불가능합니다");
					}
				}
				

			}else if(choice == 3) {
				
				break;
				
			}
			else {
				
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
			}
			
			System.out.println("---------------------------------------");

		}//while
	}//menu 메소드 끝
	
	
	
	
	public static int cal() {
		
		Scanner sc = new Scanner(System.in);
		

		int price = 0;
		
		while(true) {
			System.out.println("승객의 나이를 입력해주세요");
			int age = sc.nextInt();
			
			if(age >=20) {
				price += 300_000;
				
			}else {
				price += 120_000;
			}
			
			System.out.print("승객의 총 티켓가격은 ' " + price + "' 입니다 , 게속하시겠습니까? (y/n) :");
			String end = sc.next();
			
			if(end.equals("y")) {
				continue;
			}else {
				return price;
			}
		}

	}
	
	public static int getSecconds(int processTime) {
		
	
	return 0;
	}//초 계산 메소드 끝
	


	public static void main(String[] args) {
	
		System.out.println("지금부터 항공권 계산 해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");		

	}
}
