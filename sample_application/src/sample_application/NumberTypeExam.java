package sample_application;

public class NumberTypeExam {

	public static void main(String[] args) {
		
		byte byteNumber = 10;
		short shortNumber = 10;
		int intNumber = 1_000_000_000;
		long doubleNumber = 3_000_000_000l;
		//숫자가 클 경우 중간에 숫자를 구분짓기 위해 넣는 언더바는 무시되고 숫자만 인식한다  
		
		System.out.println(intNumber);
	}
}
