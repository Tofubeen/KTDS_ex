package method;

import java.util.Scanner;

/*
 * <pre>
 * 사칙연산을 지원하는 계산기
 * 
 * 더하기 연산이 가능 
 * 	-두 숫자를 파라미터로 받아서 두 수의 합을 출력
 * 
 * 더하기 연산이 가능 
 * 	-두 숫자를 파라미터로 받아서 두 수의 합을 출력
 * 
 * 곱하기 연산이 가능 
 * 	-두 숫자를 파라미터로 받아서 두 수의 합을 출력
 * 
 * 나누기 연산이 가능 
 * 	-두 숫자를 파라미터로 받아서 두 수의 합을 출력
 * </pre>
 */


public class SImpleCarculator {
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			
			System.out.println("메뉴");
			System.out.println("1.더하기 연산");
			System.out.println("2.빼기 연산");
			System.out.println("3.곱하기 연산");
			System.out.println("4.나누기 연산");
			System.out.println("5.끝내기");
			System.out.print("어떤 연산을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			System.out.println("---------------------------------------");

			
			
			
			if(choice == 1) {
				
				System.out.print("첫번째 숫자는 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 숫자는 : ");
				int num2 = sc.nextInt();
				
				int answer = plus(num1, num2);
				System.out.println("더하기 연산에 정답은 " + answer);
				
			}else if(choice == 2) {
				
				System.out.print("첫번째 숫자는 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 숫자는 : ");
				int num2 = sc.nextInt();
				
				int answer = minus(num1, num2);
				System.out.println("빼기 연산에 정답은 " + answer);
				
			}else if(choice == 3) {
				
				System.out.print("첫번째 숫자는 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 숫자는 : ");
				int num2 = sc.nextInt();
				
				int answer = mul(num1, num2);
				System.out.println("곱하기 연산에 정답은 " + answer);
				
			}else if(choice == 4) {
				
				System.out.print("첫번째 숫자는 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 숫자는 : ");
				int num2 = sc.nextInt();
				
				int answer = div(num1, num2);
				System.out.println("나누기 연산에 정답은 " + answer);
				
			}else if(choice == 5) {
				
				break;
			} else {
				System.out.println("잘못선택하셨습니다, 다시 선택해주세요");
				
			}//if
		}//while
	
	}
	
	
	public static int plus(int num1 , int num2) {
		int answer =(num1 + num2);
		
		return answer;
	}
	
	public static int minus(int num1 , int num2) {
		
		int answer =(num1 - num2);
		
		return answer;
	}
	
	public static int mul(int num1 , int num2) {
		
		int answer =(num1 * num2);
		
		return answer;
	}
	
	public static int div(int num1 , int num2) {
		
		int answer =(num1 / num2);
		
		return answer;
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("지금부터 사칙연산 계산기 프로그램을 시작합니다");
		menu();
		System.out.println("프로그램을 종료합니다");
		
	}
}
