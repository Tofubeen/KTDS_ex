package sample_application;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		
		//슈도콛, (의사코드) - 코드의 논리식을 문자로 나열 
		//1.랜덤한 숫자 하나를 생성
		Random ran = new Random();
		
		
		//2 사용자가 숫자를 입력
		Scanner sc = new Scanner(System.in);
		int ranNum = ran.nextInt(10);
		
		System.out.print("사용자가 입력 숫자 : ");
		int selNum = sc.nextInt();
		System.out.println("랜덤한 숫자는 : " + ranNum );
		System.out.println("---------------------------------------------");
		
		//3. 랜덤한 숫자와 사용자가 입력한 숫자가 같은지 비교
		if(ranNum == selNum) {
			System.out.println("사용자 입력 숫자와 랜덤한 숫자가 같습니다 => (O) ");
		}else { 
			System.out.println("사용자 입력 숫자와 랜덤한 숫자가 같지 않습니다 => (X)");
			System.out.println("---------------------------------------------");
			//4 랜덤한 숫자가 사용자가 입력한 숫자보다 적은지 비교
			//5 랜덤한 숫자가 사용자가 입력한 숫자보다 큰지 비교
			if(ranNum > selNum) {
				System.out.println("사용자 입력 숫자가 랜덤한 숫자보다 작습니다 => (사용자 입력 숫자 < 랜덤 숫자)");
			}else { 
				System.out.println("사용자 입력 숫자가 랜덤한 숫자보다 큽니다 => (사용자 입력 숫자 > 랜덤 숫자)");
			}
		}
		System.out.println("---------------------------------------------");
		
	}
}
