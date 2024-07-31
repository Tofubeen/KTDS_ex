package com.ktdsuniversity.edu.exceptions;

public class ExceptionTest {

	//선언된 데이터 타입과 다른 
	public static void numberFormatException(String age) {

		int iAge = Integer.parseInt(age);
		System.out.println(iAge);
	}
	
	
	/**
	 * 배열 에서만 발생하는 예외(오류)
	 * 배열의 인덱스 범위를 벗어났을 경우
	 * int[] numbers = new int[1];
	 * numbers[-1]
	 * null.?? -> nullPointerException 발생
	 */
	public static void arrayIndexOutOfBoundsException(int index , int value) {
		int[] numbers = new int[10];
		//numbers index : 0 ~ 9
		//접근가능한 인덕스 : 0 ~ 9 <-- 인덱스의 범위 
		numbers[index] = value;
		
		if(index < numbers.length) {
			numbers[index] = value;
		}
		
		for(int i = 0; i<numbers.length ; i++) {
			
		}
		
		
	}
	
	/**
	 * RefferenceType 에서만 발생하는 예외(오류)
	 * Null 인스턴스에게 접근하려는 경우
	 * null.?? -> nullPointerException 발생
	 */
	public static void nullPointerException() {
		String name = null;
		
		int length = 0;
		if( name != null) {
			length = name.length(); // <=== nullPointerException
			
		}
		
		System.out.println("name 문자열의 길이는 " + length + " 입니다");
	}
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		System.out.println();
		
		Person Person1 = new Person();
		Person person2 = new Student();
		
		
		//person is not a Person
		Student person3 = (Student)person2;
		
		
		
	}
}
