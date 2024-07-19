import java.util.Scanner;


public class ConsructorTestMain {

	public static void main(String[] args) {
		/*
		 * 생성자 : 인스턴스를 만들어주는 메소드 
		 * 생성자 : 반환타입이 없는 메소드이다
		 * 
		 * 메소드 : 특정 기능을 수행하는 코드 모음 
		 * 메소드 : 특정 기능을 수행하기 위해서 파라미터를 요구할 수 있다 
		 * 메소드: 기능을 수행한 결과를 반환 시킬 수 있다
		 */
		
		
		ConstructorTest con1 = new ConstructorTest("홍길동");
		System.out.println(con1.getName());
		
		con1.setName("홍길동");
		System.out.println(con1.getName());
		

		
	}
}
