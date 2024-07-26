package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

public interface AdressBook {

	public default void welcome() {
		System.out.println("주소록입니다");
	}
	
	public void getAdress();
	
	public void getPhoneNumber();
	
	public void getName();
	
	
	
	
	
	
	
}
