package com.ktdsuniversity.edu.exceptions.questexam;

import java.util.Scanner;

/*
 * 계산기 만들기
세 개의 파라미터를 받아 결과를 반환하는 메소드를 만들어 호출합니다.
각 파라미터는 문자열, 숫자, 숫자 로 구성되어야 합니다.
문자열 파라미터에 할당될 수 있는 값은 "+", "-", "*", "/" 이며
숫자 파라미터는 정수, 부동소수점 어느 것을 선택해도 됩니다.

만약, 문자열 파라미터에 할당된 값이 "+" 라면, 두 숫자를 더해 결과를 반환하며
"-" 라면 두 숫자를 뺀 결과를 반환하며
"*" 라면 두 숫자를 곱한 결과를 반환해야 합니다.
마지막으로 "/" 라면 두 숫자를 나눈 값을 반환해야 합니다.

문자열 파라미터에 할당된 값이 +, - , *, /, exit 가 아닐 경우 사용자 예외가 던져져야 하며 해당 메소드를 호출하는 코드에서는 던져진 예외를 잡아 내용을 출력해야 합니다.
계산기는 무한히 반복하며 계산할 수 있어야 하며, 매 반복시 마다
파라미터에 할당될 값을 입력할 수 있어야 합니다.

"exit" 문자열을 입력하면 반복이 종료되어 애플리케이션이 종료되어야 합니다.
 */
public class Calculator {

	private String operator;
	private int firstNum;
	private int seccondNum;
	private CalculatorRegistor registor;
	
	
	public Calculator() {
		this.operator = operator;
		this.firstNum = firstNum;
		this.seccondNum = seccondNum;
		this.registor = new CalculatorRegistor();
		menu();
		
	}
	
	public Calculator(String operator) {
		this.operator = operator; 
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("예외처리를 적용한 계산기 입니다 , 기능을 수행할 괄호안에 기호를 입력해주세요");
		System.out.print("1.더하기(+)\n2.빼기(-)\n3.곱하기(X)\n4.나누기(/)\n5.나가기(exit)");
		try {
			this.operator = sc.nextLine();
			
			boolean correct = registor.opeRegist(new Calculator(this.operator));
			
		} catch (WrongOperatorException e) {
			e.getMessage();
			e.printStackTrace();
			menu();
		}
		
		
		if(operator.equals("+")){
			sum();
		}else if(operator.equals("-")) {
			sub();
		}else if(operator.equals("*")) {
			mul();
		}else if(operator.equals("/")) {
			div();
		}else if(operator.equals("exit")){
			System.out.println("시스템을 종료합니다");
			System.exit(1);
		}
		
	}
	
	public void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요");
		this.firstNum = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요");
		this.seccondNum = sc.nextInt();
		System.out.println(this.firstNum + " " + this.operator + " " + this.seccondNum + " = " + (this.firstNum + this.seccondNum) );
		menu();
	}
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요");
		this.firstNum = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요");
		this.seccondNum = sc.nextInt();
		System.out.println(this.firstNum + " " + this.operator + " " + this.seccondNum + " = " + (this.firstNum - this.seccondNum) );
		menu();
	}
	public void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요");
		this.firstNum = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요");
		this.seccondNum = sc.nextInt();
		System.out.println(this.firstNum + " " + this.operator + " " + this.seccondNum + " = " + (this.firstNum * this.seccondNum) );
		menu();
	}
	public void div() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요");
		this.firstNum = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요");
		this.seccondNum = sc.nextInt();
		System.out.println(this.firstNum + " " + this.operator + " " + this.seccondNum + " = " + (this.firstNum / this.seccondNum) );
		menu();
	}
	
	

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSeccondNum() {
		return seccondNum;
	}

	public void setSeccondNum(int seccondNum) {
		this.seccondNum = seccondNum;
	}
	
	
	
	
}
