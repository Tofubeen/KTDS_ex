package com.ktdsuniversity.edu.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionTest {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		//1. 사용자가 문자를 입력하면 숫자로 변경하는 코드 (정상 처리되는 케이스)
		String str = sc.nextLine();
		int number = 0;
		if(str.matches("^[0-9]+$")) { //포멧 체크 하기 때문에 에러 발생하지않음 
			number = Integer.parseInt(str); // 값에 따라 넘버포멧엑셉편이 발생
		}
		System.out.println(number);
		
		//2.숫자를 입력받는 코드에 문자를 쓰면
		//if 체크 불가능 => 
		
		/*
		try {
			예외가 발생 할 수 있는 코드를 작성
			예외가 발생할 가능성이 0.1% 라도 있을 경우 try내부에 작성
			NumberFormatException
		} catch (try에서 발생하는 예외클래스 작성 (파라미터처럼) ==> Exception e) {
			예외를 다루는 후처리 코드 e.printStackTrace();
		}
		*/
		
		String numberstr = null;
		try {
			System.out.println("숫자를 입력하세요");
			
			numberstr = sc.nextInt() + ""; // 여기서 숫자가 아닌 문자를 입력시 밑에 있는 숫자를 입력하셨군가 출력되지 않고 바로 catch문으로 넘어가서 예외에 대한 처리를 한다
			
			System.out.println("숫자를 입력하셨군요");
			
		} catch (InputMismatchException ime) {
			System.out.println("예외가 발생해씁니다");
			System.out.println("아마도 숫자가 아닌 문자를 입력했나봅나다");
//			System.out.println(ime.getMessage());12
			ime.printStackTrace();
		} 
		System.out.println(numberstr);
		
	}
}
