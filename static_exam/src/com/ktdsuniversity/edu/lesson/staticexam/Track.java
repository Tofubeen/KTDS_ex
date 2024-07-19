package com.ktdsuniversity.edu.lesson.staticexam;

public class Track {

	public static void main(String[] args) {
		
		Car matiz = new Car(Car.SMALL, "마티즈");
		
		Car kona = new Car(Car.MIDEUM, "코나");

		Car g90 = new Car(Car.LARGE, "제네시스");
		
		matiz.startEngine();
		kona.startEngine();
		g90.startEngine();
		
		
		System.out.println();
	}
}
