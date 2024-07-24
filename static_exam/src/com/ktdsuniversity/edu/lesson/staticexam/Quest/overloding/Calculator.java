package com.ktdsuniversity.edu.lesson.staticexam.Quest.overloding;

public class Calculator {

    // 기본 생성자
    public Calculator() {
        System.out.println("기본 생성자가 호출되었습니다.");
    }

    // 하나의 정수 매개변수를 받는 생성자
    public Calculator(int value) {
        System.out.println("정수 하나를 받는 생성자가 호출되었습니다: " + value);
    }

    // 두 개의 정수 매개변수를 받는 생성자
    public Calculator(int value1, int value2) {
        System.out.println("두 개의 정수를 받는 생성자가 호출되었습니다: " + value1 + ", " + value2);
    }

    // 더하기 메소드 (두 개의 정수)
    public int add(int a, int b) {
        return a + b;
    }

    // 더하기 메소드 (두 개의 실수)
    public double add(double a, double b) {
        return a + b;
    }

    // 더하기 메소드 (세 개의 정수)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
    	
    	
        // 생성자 오버로딩 예제
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(10);
        Calculator calc3 = new Calculator(20, 30);

        // 메소드 오버로딩 예제
        Calculator calculator = new Calculator();
        System.out.println("10 + 20 = " + calculator.add(10, 20));
        System.out.println("10.5 + 20.5 = " + calculator.add(10.5, 20.5));
        System.out.println("10 + 20 + 30 = " + calculator.add(10, 20, 30));
    }
}

