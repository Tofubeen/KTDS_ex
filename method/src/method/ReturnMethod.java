package method;

import java.util.Random;

public class ReturnMethod {

	public static int getRandomNumber() {
		Random ran = new Random();
		
		
		return ran.nextInt();
	}
	
	
	public static void main(String[] args) {
		int randomNumber = getRandomNumber();
		System.out.println(randomNumber);
		
	}
}
