package com.ktdsuniversity.edu.abstractclass.abstractBar;

import java.util.Random;
import java.util.Scanner;

/**
 * 1/성인들만 이용할수 있는 바
 * 	-이용하는 모두가 성인이다
 * 	-자유롭게 주류를 주문
 * 2.모든 연령대가 이용할 수 있는 바
 * 	-주문을 할려면 반드시 성인이어야 한다 
 * 	-자유롭게 주문을 할 수 없음
 * 
 * 차이점(사상)
 * 		-주류를 주문할때 나이를 확인하는가 <--> 아닌가
 * 			-성인전용 바 
 * 				-나이 확인 x
 * 			-바
 * 				-나이 확인 O
 * 공통점(추상)
 * 		-나이를 확인하지않는 모든기능 
 */			


//모든 연령대가 이용할수 있는 바
public class WhiskiBar extends AbstractBar {

	public WhiskiBar() {
		super();

	}

	@Override
	public boolean isAdult() {
		return true;
		
	}

	@Override
	public void getOut() {
		
	}

	
	


}
