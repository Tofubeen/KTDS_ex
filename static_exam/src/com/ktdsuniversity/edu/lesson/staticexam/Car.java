package com.ktdsuniversity.edu.lesson.staticexam;

public class Car {

	public static final String SMALL ="경차";
	public static final String MIDEUM ="중형차";
	public static final String LARGE ="대형차";
	
	private String carSize;
	
	
	private String carName;


	public Car(String carSize, String carName) {
		super();
		this.carSize = carSize;
		this.carName = carName;
	}
	
	
	public void startEngine() {
		System.out.println(this.carName + " (" + this.carSize + ") 시동걸기" );
	}
}
