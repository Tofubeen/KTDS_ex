package com.ktdsuniversity.edu.exetendsexam;

public class SportsCar extends Vehicle{

	public SportsCar(String carName) {
		super(carName);
		
	}
	
	@Override
	public void powerOn() {
		super.powerOn();
	}
	
	public void turBo() {
		System.out.println("터보모드를 작동합니다");
	}

}
