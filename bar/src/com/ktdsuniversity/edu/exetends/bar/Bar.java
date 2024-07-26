package com.ktdsuniversity.edu.exetends.bar;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * menu 메소드 :
 * 메뉴판입니다
 * 
 * sale 메소드 :
 * 주문한 음료의 종류(탄산음료 ,주류) 에 따라 신분증을 요구합니다 
 * 나이가 미성년자일시 System.exit(); 를 실행하며 메인 메소드가 종료됩니다, 성인일시 주류를 판매하며 alcoholCount가 1씩 올라갑니다
 * 
 * CheckDrunk 메소드 : 
 * 주류를 선택할때마다 올라간 alcoholCount 가 일정범위이상 올라갔을때 메소드내에 코드가 실행되면 
 * BAC(혈중알코올농도) 는 Random 함수의 0~1의 범위에서 소수점 둘째라리의 난수가 생성되면 일정수준 이상의 숫자가 나올시에 메인클래스의 check 변수로 false를 리턴하며
 * BarMain 클래스의  while문은 if(!check) { break;} 를 실행하며 프로그램은 종료됩니다
 */







public class Bar {

	private Drink[] drinks;
	private int wallet;
	private double BAC; //혈중 알코올 농도(血中 알코올 濃度, Blood Alcohol Content, BAC) - BAC가 뭔지 알려드리기 위해서 작성
	private int alcoholCount; //
	
	
	
	
	public Bar() {
		
		this.drinks = new Drink[4]; // 생성자 선언시 음료가 들어간 배열이 생성됩니다 
		this.alcoholCount = 0;
		drinks[0] =  new Sodas("펩시라임", "제로탄산" , 1000);
		drinks[1] = new Sodas("코카콜라", "탄산음료" , 1500);
		drinks[2] = new Alcohols("진로", "소주",6000);
		drinks[3] = new Alcohols("테라", "맥주" , 5000);
		
		
	}
	
	public int getWallet() {
		return this.wallet;
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
	
	public void sale(int choice) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
			 
			if(drinks[choice] instanceof Alcohols) {
				System.out.println("신분증 좀 보여주세요");
				int age = sc.nextInt();
				
				if(age >= 20) {
					this.wallet += drinks[choice].getCost();
					this.alcoholCount += 1;
					System.out.println("여깃습니당 맛있게 드세요~");
					System.out.println("----------------------------------------");

				}else {
					System.out.println("나가세요");
					System.exit(1);
				}//신분증검사
				
			}else {
				this.wallet += drinks[choice].getCost();
				System.out.println("주문하신 음료 나왔습니다 맛있게 드세요~");
				System.out.println("----------------------------------------");

			}
			
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
	
	public void totalSales() {
		System.out.println("오늘 매출은 " + getWallet() + " 입니다");
	}

	
	
	
	
	
	
	
	
}
