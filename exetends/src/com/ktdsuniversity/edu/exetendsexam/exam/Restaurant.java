package com.ktdsuniversity.edu.exetendsexam.exam;

public class Restaurant {

	public static void main(String[] args) {
		
		Drink[] drinks = new Drink[4];
		
		
		drinks[0] =  new Sodas("펩시라임", "제로칼로리");
		drinks[1] = new Sodas("코카콜라", "설탕팍팍들어간 리얼 탄산음료");
		drinks[2] = new Alcohols("진로", "소주");
		drinks[3] = new Alcohols("테라", "맥주");
		
		
		for(int i = 0; i<drinks.length ; i++) {
			
			if(drinks[i] instanceof Sodas) {
				System.out.println(drinks[i].getName() + " 는 맛있네~");
			}else if(drinks[i] instanceof Alcohols) {
				System.out.println(drinks[i].getName() + " 를 먹으니까 취한다");
			}
			
		}
		
		
		
		
		
	}
}
