package sample_application;

import java.util.Scanner;

public class QuestExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 7월 15일 과제.

		손님이 영화관에 10000원을 가지고 입장했습니다.
		손님은 관람비가 18000원인 영화를 관람하려 합니다.
		손님은 영화를 관람할 수 있을까요?
		관람할 수 있다면, "관람가능"을 출력하고 지불하고 남은 금액을 출력합니다.
		관람할 수 없다면, "관람불가능"을 출력하고 모자란 금액을 출력합니다.
		*/
		int price = 18000;
		
		System.out.print("내가 가지고 있는 돈은? : ");
		int money = sc.nextInt();
		System.out.println("영화가격은 " + price + " 입니다");
		
		if(money >= price) {
			System.out.println("영화관람이 '가능' 합니다 남은 금액은 '" + (money-price) + "'입니다");			
		}else {
			System.out.println("영화관람이 '불가능' 합니다 모자란 금액은 '" + (price-money) + "'입니다");
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		/*
		무한 구구단을 출력합니다.
		사용자가 입력한 구구단의 결과를 출력합니다.
		만약, 3을 입력했다면, 구구단 3단을 출력합니다.
		만약, -1을 입력했다면, 구구단 출력 프로그램을 종료해야합니다.
		*/
		System.out.println("무한 구구단을 시작합니다");
		
		while(true) {
		System.out.print("굼금한 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
			for(int i =1 ; i <=9 ; i++) {
			System.out.println(num + " X " + i + " = " +  (num*i));
			}//for
		
		System.out.println("1.게속할려면 1 \n2.끝내기는 -1을 입력해주세요 ");
		System.out.print("게임을 더 하시겠습니까? :");
			int end = sc.nextInt();
		
			if(end == -1) {
			break;
			}//if
		
		}//while
		
		System.out.println("게임을 종료합니다");
		System.out.println("----------------------------------------------------------------------------------");
		
		/*
		PPT 교재 158페이지의 4번 문제를 풀어보세요.
		4번 문제를 풀기위한 논리와 함께 코드를 작성합니다.
		
		과제를 7월 16일 강의 시작 전까지 댓글에 첨부하여 등록하세요.
		 */
		System.out.println("별 출력 문제를 시작합니다");
		int num2 =1;
		
		for(int i = 0 ;i<5 ; i++) {
			for(int j = 5; j>i ; j-- ) {
				System.out.print(" ");
			}
			for(int k = 0 ; k <num2 ; k ++) {
				System.out.print("*");
			}
			num2 +=2;
			System.out.println();
		}//for
		
		System.out.println("----------------------------------------------------------------------------------");
		/*
		 * 이 코드는 가운데 정렬한 삼각형의 모양이 출력이 될수있게 만들어진 코드입니다
		 * 처음 시작할때 공백이 5개에서 시작하여 4개 3개 2개~ 시작으로 줄어들면서 출력이 되고
		 * 별의 갯수는 홀수로 출력이 되어 마치 가운데 정렬을 한 모습으로 출력이 됩니다 
		 */
		System.out.println("모든 프로세스가 끝났습니다");
	}
}
