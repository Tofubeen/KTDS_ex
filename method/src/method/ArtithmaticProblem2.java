package method;

import java.util.Scanner;

public class ArtithmaticProblem2 {

	public static final int ONE_MINUTE = 60;
	
	/*

	 */
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.분과 초로 변환하기");
			System.out.println("2.끝내기");
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				System.out.print("변환할 초를 입력해주세요");
				int processTime= sc.nextInt();
				
				int minutes = getMinutes(processTime);
				int seccond = getSecconds(processTime);
				System.out.println("변환한 분은 " + minutes + "분 , 변환한 초는 " + seccond + "초 입니다 ");
			
			}else if(choice == 2) {
				
				break;
				
			}else {
				
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
			}
			
			System.out.println("---------------------------------------");

		}//while
	}//menu 메소드 끝
	
	
	
	
	public static int getMinutes(int processTime) {
		
		int minutes = processTime / ONE_MINUTE;
		
		
	return minutes;
		
	}//분 계산 메소드 끝
	
	public static int getSecconds(int processTime) {
		
		int seccond = processTime % ONE_MINUTE;
						
				
	return seccond;
	}//초 계산 메소드 끝
	
	
	
	
	
	

	public static void main(String[] args) {
	
		System.out.println("지금부터 입력한 시간을 분과 초로 변환 해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");		

	}
}
