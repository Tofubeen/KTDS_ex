package sample_application;

public class AvgExam {

	static int math =100;
	static int sc = 90;
	static int eng = 80;
	static int kor = 70;
	
	static int sum1 = 0;
	static double avg1 =0;
	
	public static int sum2(int x , int y ,int z , int w) {
		int val = 0;
		val = x + y + z + w;
		return val;
	}
	
	public static double avg2(int x , int y) {
		double val = 0;
		val = x / y;
		return val;
	}
	
	
	public static void main(String[] args) {
	
		
		sum1 = math + sc + eng + kor; //전역변수를 이용한 계산 
		avg1 = sum1 /4;
		
		
		int val1 = sum2(100, 100, 90, 90); //전역 메소드를 이용한 계
		double val2 = avg2(val1 , 4);
		
		System.out.println(sum1);
		System.out.println(avg1);
		System.out.println(val1);
		System.out.println(val2);
		
		
	}
}
