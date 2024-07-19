package method;

import java.util.Scanner;

public class ArtithmaticProblem1 {

	/*
	 * 이 코드는 메뉴 선택 메소드를 호출하여 프로세스를 선택하고 
	 * 초 계산 프로세스를 선택하면 분과 초를 받아 계산하고 
	 * 끝내기 프로세스를 선택하면 프로그램을 종료합니다
	 * 1과 2가 아닌 다른 숫자를 입력하면 에러 메시지를 출력하고 재선택을 요구합니다
	 */
	
	
	public static final int ONE_MINUTE = 60;
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.초 계산하기");
			System.out.println("2.끝내기");
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
			int answer = getTime();
			System.out.println("변환한 초는 " + answer + " 입니다");
			
			}else if(choice == 2) {
				
				break;
				
			}else {
				
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
			}
			
			System.out.println("---------------------------------------");

		}//while
	}//menu 메소드 끝
	
	
	
	
	private static int getTime() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분을 입력해주세요");
		int minutes= sc.nextInt();
		System.out.print("초를 입력해주세요");
		int seconds= sc.nextInt();
		
		int time = (minutes * ONE_MINUTE) + seconds;
		return time;
	}//초 계산 메소드 끝
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("지금부터 분과 초를 통합한 초를 계산해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");		

	}
}
