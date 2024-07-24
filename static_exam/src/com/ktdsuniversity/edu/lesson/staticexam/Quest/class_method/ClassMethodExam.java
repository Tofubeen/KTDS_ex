package com.ktdsuniversity.edu.lesson.staticexam.Quest.class_method;

/*
 * 
 * 클래스 메소드 실습 문제
isValidAge(int age, int min, int max) 클래스 메소드를 만들고
age의 값이 min보다 크고 max 보다 작으면 true를, 
아니면 false를 반환하도록 작성하고 호출해보세요.
getCourseCredit(double average) 클래스 메소드를 만들고
average의 값을 4.5 만점 기준의 학점을 반환하도록 작성하고 호출해보세요.
getABCDE(double courceCredit) 클래스 메소드를 만들고 학점 기준에 맞춰 
ABCDE 등급을 반환하도록 작성하고 호출해보세요.
교재 199번 슬라이드 학생 평균 및 학점 구하기 실습문제 중 
getCourseCredit과 getABCDE 인스턴스 메소드를 클래스 메소드로 변경해보세요.

 */

public class ClassMethodExam {

	
	//age의 값이 min보다 크고 max 보다 작으면 true를, 아니면 false를 반환
	public static boolean isValidAge(int age, int min, int max) {
		if(age > min && age < max) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param average => average의 값을 4.5 만점 기준의 학점을 반환하도록 작성
	 * @return 학점환산공식 환산학점 = (average / 100) * 4.5
	 */
	public static double getCourseCredit(double average) {
		
		double courceCredit = (average/100) * 4.5 ;
		
		return courceCredit;
	}
	
	 public String getABCDE(double courseCredit) {
	        if (courseCredit >= 4.0) {
	            return "A";
	        } else if (courseCredit >= 3.0) {
	            return "B";
	        } else if (courseCredit >= 2.0) {
	            return "C";
	        } else if (courseCredit >= 1.0) {
	            return "D";
	        } else {
	            return "E";
	        }
	 }
}
