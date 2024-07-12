package sample_application;

import java.util.Random;

public class Mart {

	public static void main(String[] args) {
		
		int money = 2000;
		
		Random random = new Random();
		
		int price = random.nextInt(4000); // 괄호 안의 숫자는 범위로서 0~ 3999를 의미한다 
		
		System.out.println("내가 가진 돈 : " + money);
		System.out.println("이번에 살 물건 가격 : " + price);
		
		if(money >= price) {
			System.out.println("OOOOO살수있다OOOOO");
		} else {
			System.out.println("XXXXX살수없다XXXXX");
			
		}
		
	}
}
