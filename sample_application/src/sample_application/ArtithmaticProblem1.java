package sample_application;

public class ArtithmaticProblem1 {

	public static final int ONE_MINUTE = 60;
	
	public static void main(String[] args) {
		int minutes= 5;
		int seconds= 50;
		int time= 0;

		time = (minutes * ONE_MINUTE) + seconds;
		
		System.out.println(time);
		
		/*
		         * 산술연산자를 이용해
		         * minutes와 seconds의 값을 초로 변환해 
		         * time 변수에 할당하고 출력해보세요.
		         */

	}
}
