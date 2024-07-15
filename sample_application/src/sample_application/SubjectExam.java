package sample_application;

import java.util.Scanner;

public class SubjectExam {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어성적 : ");
		int korScore = sc.nextInt();
		
		System.out.println("영어성적 : ");
		int engScore = sc.nextInt();
		
		System.out.println("수학성적 : ");
		int mathScore = sc.nextInt();
		
		System.out.println("프로그래밍성적 : ");
		int proScore = sc.nextInt();;
		
		int sum = korScore + engScore + mathScore + proScore;
		double avg =(double)(sum/4) ;
		
		System.out.println("---------------------------------------------------");
		
		
//		// 국어, 영어, 수학, 프로그래밍의 합계와 평균을 각각 계산해 할당하고
//		    // 아래 기준에 따라 성적을 출력해보세요.
//		    // 평균점수 95점 이상: A+
//		    // 평균점수 90점 이상: A
//		    // 평균점수 85점 이상: B+
//		    // 평균점수 80점 이상: B
//		    // 평균점수 70점 이상: C
//		    // 평균점수 70점 미만: F
		
		if(avg>= 95) {
			System.out.println("평균은 '" + avg + "' 이므로 성적은 'A+' 입니다");
		} else if(avg>= 90) {
			System.out.println("평균은 '" + avg + "' 이므로 성적은 'A' 입니다");
		} else if(avg>= 85) {
			System.out.println("평균은 '" + avg + "' 이므로 성적은 'B+' 입니다");
		} else if(avg>= 80) {
			System.out.println("평균은 '" + avg + "' 이므로 성적은 'B' 입니다");
		} else if(avg>= 70) {
			System.out.println("평균은 '" + avg + "' 이므로 성적은 'C' 입니다");
		} else {
			System.out.println("평균이 '" + avg + "' 이며 70점 미만이므로 성적은 'F' 입니다");
		}


		}

}
