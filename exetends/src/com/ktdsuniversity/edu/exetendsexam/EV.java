package com.ktdsuniversity.edu.exetendsexam;

public class EV extends Vehicle{

	private int battery;
	
	
	public EV(String carName , int battery) {
		super(carName);
		this.battery = battery;
		
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
	}
	
	public void batteryCheck() {
		System.out.println( this.getCarName() + "의 베터리를 체크합니다 , 베터리는 " + this.battery +  " 입니다 ");
	}

}
