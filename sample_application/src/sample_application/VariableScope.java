package sample_application;

public class VariableScope {

	public static void main(String[] args) {
		
		int number = 10;
		int other = 5;
		
		//number 의 수와 other 의 수 중 큰 숫자는 무엇인가
		
		if(number > other) { 
			System.out.println(number  + " 와 " + other + " 중 큰 숫자는 " + number + "입니다" );
				
		}else {
			System.out.println(number  + " 와 " + other + " 중 큰 숫자는 " + other + "입니다" );
		}
		
	}
}
