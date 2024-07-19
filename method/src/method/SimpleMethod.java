package method;

import java.util.Scanner;

public class SimpleMethod {

	public static void greating() {
		
		System.out.println("Hello, Method");
		
	}
	
	public static void addNumber() {
		
		int numberOne = 10;
		int numberTwo = 30;
		System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
		
	}
	
	public static void gugudan() {
		
		for(int i =0; i< 10 ; i++) {
			for(int j =1; j< 10 ; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		
	}
	
	public static void totalSum() {
		
		//1. 1부터 1000까지의 합 출력 
		int result1 =0;
		for(int i =0 ;i <=1000 ; i++) {
			result1 += i;
			
		}
		System.out.println(result1);
		
		
		
	}
	
	public static void evenSum() {
		
		//2. 1부터 100중 짝수의 합 출력
		int result2 = 0;
		for(int i=0; i<=100 ; i+=2) {
			result2 +=i;
		}
		System.out.println(result2);
		
		System.out.println();
		
	}
	
	public static void gugudanPrint() {
		
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
		
	}
	
	
	public static void main(String[] args) {
				
				
				

		
		greating();
		
		addNumber();
		
		gugudan();
		
		totalSum();
		
		evenSum();
		
		gugudan();
		
		
	}
}
