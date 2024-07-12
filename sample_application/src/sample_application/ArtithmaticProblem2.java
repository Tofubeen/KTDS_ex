package sample_application;

public class ArtithmaticProblem2 {

	public static final int ONE_MINUTE = 60;

	
	public static void main(String[] args) {
		int processTime= 145;
		int minutes= 0;
		int seconds= 0;

		minutes = processTime / ONE_MINUTE;
		seconds = processTime % ONE_MINUTE;
		
		System.out.println(minutes);
		System.out.println(seconds);
		
		/*
		         * 산술 연산자를 이용해 
		         * processTime을 분(Minute), 초(Second)
		         * 를 구한다음 minutes, seconds 변수에 할당하고
		         * 출력해보세요.
		         */


	}
}
