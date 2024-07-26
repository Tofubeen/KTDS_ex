package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

public interface Fly {
	
	/**
	 * Default Abstract Method
	 * Default Method ==> 추상메소드가 기본적으로 하는 일을 미리 만들어 둔것
	 */
	
	public default void fly() {
		//변수 사용 x
		System.out.println("날아오르라 주작이여");
	}
	
}
