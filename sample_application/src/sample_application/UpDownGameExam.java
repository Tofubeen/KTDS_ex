package sample_application;

import java.util.Scanner;

public class UpDownGameExam {

	public static void main(String[] args) {
		
		System.out.println("업다운게임");
		
		double randomFlotingPoint = Math.random(); //부동소수점 형태의 난수 생성
		int correctNumber = (int)(randomFlotingPoint*100);
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("정답은? : ");
			int answer = sc.nextInt();
			
			if(answer == correctNumber) {
				System.out.println("정답!");
				break;
			} else if(correctNumber >answer) {
				System.out.println("Up!");
			} else {
				System.out.println("Down");
			}
			
		} 
		
	}
}
