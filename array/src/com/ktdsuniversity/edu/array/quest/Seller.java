package com.ktdsuniversity.edu.array.quest;

import java.util.Scanner;


public class Seller {
	
	
	private Product[] Goods; //상품배열

	
	public Seller() {  //기본 생성자를 호출하면서 상품의 배열을 완성시킵니다
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품의 갯수를 입력해주세요");
		int types = sc.nextInt(); 
		
		this.Goods = new Product[types];
		
		
		for(int i = 0 ; i<this.Goods.length ; i++) {
			System.out.print("상품명을 입력해주세요");
			String name = sc.next();
			System.out.print("상품가격을 입력해주세요");
			int price = sc.nextInt();
			System.out.print("상품갯수를 입력해주세요");
			int quantity = sc.nextInt();
			
			Product product = new Product(name, price, quantity);
			this.Goods[i] = product;
			
		}//for
		System.out.println();
		
	}
	
	
	
	
	//상품출력메소드
	public void printGoods() {
		System.out.println("상품명\t상품가격\t상품갯수");
		System.out.println("-------------------------------------");
		for(int i = 0; i<Goods.length;i++) {
			System.out.println(Goods[i].getName() + "\t" + Goods[i].getPrice() + "\t" + Goods[i].getQuantity());
		}
		System.out.println();
	}



	
	
	//판매메소드
	public void sale() {

		Scanner sc = new Scanner(System.in); 
		
		
		while(true) {
			
		System.out.print("구매할 상품을 입력해주세요.");
		String saleProduct = sc.next();
		System.out.print("구매할 갯수를 입력해주세요.");
		int buyCount = sc.nextInt();
		
			for(int i =0; i<Goods.length ; i++) { //배열의 길이만큼 반복
				/*
				 입력한 상품의 이름이 같고 
				 상품재고가 구매할 상품의 갯수보다 크거나 같고 
				 재고가 0이 아닐 경우 
				 구매할 갯수 만큼 재고에서 차감한 새로운 인스턴스를 만들어 상품이 위치한 배열의 순서에 새로운 인스턴스를 할당합니다 
				 */
				if(Goods[i].getName().equals(saleProduct)) {// 배열에 저장된 상품의 이름과 구매할려는 상품의 이름이 같을시
					
					if(Goods[i].getQuantity() >= buyCount && Goods[i].getQuantity() != 0) { // 재고가 구매수량보다 많고 "그리고" 재고가 0이 아닌경우
						Goods[i] = new Product(saleProduct, Goods[i].getPrice(), Goods[i].getQuantity()-buyCount);
						break; //상품 구매 후 for문을 빠져나옵니다
						
					}else if(Goods[i].getQuantity() < buyCount || Goods[i].getQuantity() == 0){ //재고보다 구매수량이 "많거나" 재고가 0인경우
						System.out.println("판매 할 수 없습니다");
						System.out.println("-----------------------------");
						break;
					}
					
				}//if
				
			}//for
		

		
			//종료시퀀스입니다 구매가 끝나면 게속 묻습니다
		
			System.out.print("종료하시겠습니까?(y/n) : ");
			String end =sc.next();
			
			if(end.equals("y")) { //남은 상품들을 출력하고 종료합니다
				System.out.println();
				printGoods(); //상품 재고 출력
				System.out.println();
				break;
				
			}else if(end.equals("n")) { //상품구매를 게속합니다
				System.out.println();
				printGoods();//상품 재고 출력
				System.out.println();
				continue;
				
			}
		}//while
		
	}
	


}
