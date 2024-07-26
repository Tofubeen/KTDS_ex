package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.AdressBook;

public class Kim implements AdressBook{

	
	private String name;
	private String phoneNumber;
	private String adress;
	
	
	
	public Kim(String name, String phoneNumber, String adress) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
	}

	@Override
	public void getName() {
		System.out.println(this.name + "입니다");
		
	}
	
	@Override
	public void getAdress() {
		System.out.println(this.name + " 에 주소는 " + this.adress);
		
	}

	@Override
	public void getPhoneNumber() {
		System.out.println(this.name + " 에 번호는 " + this.phoneNumber);
		
	}

}
