package com.ktdsuniversity.edu.exetendsexam;

public class Vehicle {

	private String carName;
	
	
	
	public Vehicle(String carName) {
		this.carName = carName;
	}

	
	
	

	public String getCarName() {
		return carName;
	}





	public void powerOn() {
		System.out.println("시동을 겁니다");
	}
	public void powerOff() {
		System.out.println("시동을 끝니다");
	}
	
}
