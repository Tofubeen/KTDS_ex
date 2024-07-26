package com.ktdsuniversity.edu.exetendsexam;

public class Contact {

	private String name;
	private String phone;
	
	/**
	 * 
	 * 사용자의 요청으로 이메일 추가
	 * 
	 */
	
	private	String email;
	
	
	/**
	 * 
	 * 사용자의 요청으로 주소추가
	 */
	private String address;
	
	
	
	
	
	
	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	



	public String getName() {
		return this.name;
	}




	public String getPhone() {
		return this.phone;
	}

	
	


	




	public void printContact () {
		System.out.println("이름 : " + this.name + ", 연락처: " + this.phone + " , 이메일 : " + this.email + "  , 주소 : " + this.address);
	}
	
	
}
