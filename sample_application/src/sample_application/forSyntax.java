package sample_application;

import java.util.Scanner;

public class forSyntax {

	public static void main(String[] args) {
		
		/*
		 * for문
		 */
		
		
//		for(int i =1 ; i<=100 ;i++) {
//			System.out.println(i);
//		}
		System.out.println("--------------------------------------------------------------------------------1부터 1000까지의 합 출력");
		//1. 1부터 1000까지의 합 출력 
		int result1 =0;
		for(int i =0 ;i <=1000 ; i++) {
			result1 += i;
			
		}
		System.out.println(result1);
		
		System.out.println("--------------------------------------------------------------------------------1부터 100중 짝수의 합 출력");
		
		
		
		
		//2. 1부터 100중 짝수의 합 출력
		int result2 = 0;
		for(int i=0; i<=100 ; i+=2) {
			result2 +=i;
		}
		System.out.println(result2);
		
		System.out.println();
		
		System.out.println("--------------------------------------------------------------------------------구구단 출력");
		//3. 구구단 3단 출력
		
		for(int i =1 ; i<=9 ; i++  ) {			
			for(int j =2 ; j<=9 ;j++) {
				int result3 = i*j;
				System.out.print(j + " X " + i + " = " + result3 + "\t");
			}
			System.out.println();
			
		} //for 
		System.out.println("--------------------------------------------------------------------------------원하는 숫자 구구단 출력");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		//3-1 원하는 숫자 구구단 출력
		int num1 = sc.nextInt();
		for(int i =1 ; i <=9 ;i++) {
			System.out.println(num1 + " X " + i + " = " + num1*i);
		}
		
		System.out.println("--------------------------------------------------------------------------------별 출력");

		
		//4. 별 출력
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
		
	}
}
