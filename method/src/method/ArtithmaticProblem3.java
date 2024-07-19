package method;

import java.util.Scanner;

public class ArtithmaticProblem3 {

	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.화씨 계산하기");
			System.out.println("2.끝내기");
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				System.out.print("변환할 섭씨를 입력해주세요");
				int celsius= sc.nextInt();
				
				int fahrenheit = getFahrenheit(celsius);
				System.out.println("입력한 섭씨 " + celsius + "도를 , 화씨롤 변환한 온도는 " + fahrenheit + " 입니다 ");
			
			}else if(choice == 2) {
				
				break;
				
			}else {
				
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
			}
			
			System.out.println("---------------------------------------");

		}//while
	}//menu 메소드 끝
	
	
	
	
	public static int getFahrenheit(int celsius) {
		
		int fahrenheit =  (celsius * 9/5) + 32;
		return fahrenheit;
	}//화씨 계산 메소드 끝
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("지금부터 섭씨 화씨로 계산해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");	


	}
}
