package method;

import java.util.Scanner;

public class AvgExam {

	
	
	
public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.학생의 총 점 , 평균 , 평균의 따른 등급 계산하기");
			System.out.println("2.끝내기");			
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				System.out.print("수학 성적을 입력해주세요");
				int math =sc.nextInt();
				System.out.print("영어 성적을 입력해주세요");
				int eng = sc.nextInt();
				System.out.print("국어 성적을 입력해주세요");
				int kor = sc.nextInt();
				System.out.print("프로그래밍 성적을 입력해주세요");
				int pro = sc.nextInt();
				
				System.out.println("입력한 과목 수 를 입력해주세요");
				int countSub = sc.nextInt();
				
				
				int sum = getSum(math , eng , kor , pro);
				double avg = getAvg(sum , countSub); 
				String rank = getRank(avg);
				
				System.out.println("학생의 총점은 '" + sum + "' 이며 평균은 '" + avg + "' , 그러므로 등급은 '" + rank + "' 입니다 ");
			
			}else if(choice == 2) {
				
				break;
				
			}else {
				
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
			}
			
			System.out.println("---------------------------------------");

		}//while
	}//menu 메소드 끝
	
	
	public static int getSum(int math , int eng , int kor , int pro) {
		int sum = math + eng + kor + pro;
		return sum;
	}
	
	public static double getAvg(int sum , int countSub) {
		double avg = sum /countSub;
		return avg;
	}
	
	public static String getRank(double avg) {
		
		String Rank = "";
		if(avg>= 95) {
			Rank = "A+";
		} else if(avg>= 90) {
			Rank = "A";
		} else if(avg>= 85) {
			Rank = "B+";
		} else if(avg>= 80) {
			Rank = "B";
		} else if(avg>= 70) {
			Rank = "C";
		} else {
			Rank = "F";
		}
		return Rank;
	}
	
	
	public static void main(String[] args) {
	
		
		
		System.out.println("지금부터 학생의 성적을 계산 해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");	
	
	}
}
