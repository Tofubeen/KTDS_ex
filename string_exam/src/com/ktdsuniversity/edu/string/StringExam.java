package com.ktdsuniversity.edu.string;

public class StringExam {

	
	
	/**
	 * 파라미터에서 파일의 이름만 추출해서 반환 
	 * @param filePath
	 * @return
	 */
	public static String extractFileName(String filePath) {
		
		
		
		
		return filePath.substring( filePath.lastIndexOf("\\") +1);
	}
	
	
	
	
	public static void printSubStringExtractFileNameResult() {
		
		String filePath = "c:\\dev_program\\images\\pen.png";
		String fileName = extractFileName(filePath);
		System.out.println(fileName);
		
		
		
		
	}
	
	
	
	
	public static void printSubDateTimeResult() {
//						   0123456789012345678
		String dateTime = "2023-05-02 14:56:13";
		
		//datetime 에서 연도만 추출
		String year = dateTime.substring(0, 4);
		System.out.println(year);
		//datetime 에서 월만 추출
		String month = dateTime.substring(5, 7);
		System.out.println(month);
		//datetime 에서 일만 추출
		String day = dateTime.substring(8, 10);
		System.out.println(day);
		//datetime 에서 시 추출
		//datetime 에서 분 추출
		//datetime 에서 초 추출
		
		
		
		
	}
	
	
	
	
	public static void printSplitResult() {
		String phoneNumber = "+82-10-8222-5642";
		
		String[] str = phoneNumber.split("-");
		
		for(int i=0; i<str.length ; i++) {
			System.out.println(str[i]);
		}
		
		 
		
		
	}
	public static void printReplaceAllResult() {
		String phoneNumber = "010-8222-5642";
		
		//영문자 특히 영 대문자로만 구성이 되어있는가 
		
		
	}
	
	
	
	
	public static void printIsNullOrEmptyResult() {
		
		/*
		 * String Instance.trim()
		 * exam
		 * 	String abc = " a b c ";
		 * 	abc.trim() = "a b c";
		 * 	abc.trim.length() = "5";
		 * 	
		 */
		
		
		String str = "";
		boolean isEmpty = str == null || str.trim().length() == 0;
		System.out.println(isEmpty);
		
		String str2 = "   ";
		isEmpty = str2 == null || str2.trim().length() ==0;
		System.out.println(isEmpty);
		
		
		String str3 = " aaa ";
		isEmpty = str3 == null || str3.trim().length() ==0;
		System.out.println(isEmpty);
		
		String str4 = null;
		isEmpty = str4 == null || str4.trim().length() ==0;
		System.out.println(isEmpty);
		
	}
	public static void printIsEmptyResult() {
		
		String str = "   ";
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
		
		str = "s";
		isEmpty = str.isEmpty();
		System.out.println(isEmpty);
			
	}
	public static void printIsBlankResultOnJava11() {
		
		String str = "   ";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		
		str = "s";
		isBlank = str.isBlank();
		System.out.println(isBlank);
		
	}
	public static void printIndexOfResult() {
		
		String fileName = "score.xlsx";
		int dotIndex = fileName.indexOf('.');
		
		System.out.println(dotIndex);
		
		int smallXIndex = fileName.indexOf("x");
		System.out.println(smallXIndex);
		
		int bigXIndex = fileName.indexOf("X");
		System.out.println(bigXIndex);
		
	}
	
	
	public static void printFormatResult() {
		
		/*
		 * %s : String 할당
		 * %d : Decimal 할당 
		 * %f : floating point number 할당
		 * %.2f : 부동소수점들을 소수점 이하 두 자리만 표현 
		 * %.4f : 부동소수점들을 소수점 이하 네 자리만 표현 
		 */
		String address = "%s 에서 교육하는 - %s %d 교육입니다";
		String formatedString = String.format(address, "ktds university" , "java" , 22); 
		
		System.out.println(formatedString);
	}
	
	public static void printStartWithResult() {
		
		
		String address = "https://edu.ktdsuniversity.com";
		
		boolean check =  address.startsWith("https://");
		System.out.println(check);
	}
	
	public static void printContainResult() {
		
		
		String address = "서울특별시 서초구 효령로 176";
		
		boolean check =  address.contains("서초");
		System.out.println(check);
	}
	
	
	
	public static void main(String[] args) {
		
		
		String booleanString =  String.valueOf(false);
		
		String name = "mcjang";
		char letter = name.charAt(0);
		
		System.out.println(letter);
		
		printContainResult();
		printStartWithResult();
		printFormatResult();
		printIndexOfResult();
		printIsBlankResultOnJava11();
		printIsEmptyResult();
		printSplitResult();
		printSubDateTimeResult();
		printSubStringExtractFileNameResult();
		
	}
	
	
	
}
