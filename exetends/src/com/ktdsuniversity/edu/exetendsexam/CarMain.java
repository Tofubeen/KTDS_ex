package com.ktdsuniversity.edu.exetendsexam;

public class CarMain {

	public static void main(String[] args) {
		
		BatMobile bat = new BatMobile("배트맨 차");
		EV ioniq = new EV("아이오닉6", 90); 
		bat.powerOn();
		ioniq.batteryCheck();
		bat.turBo();
		bat.batPortSeparation();
		
		bat.powerOn();
		bat.powerOff();
		
	}
}
