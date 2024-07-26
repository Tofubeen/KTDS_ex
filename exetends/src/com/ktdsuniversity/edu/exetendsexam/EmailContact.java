package com.ktdsuniversity.edu.exetendsexam;

/**
 * 이름 , 전화번호를 가지고 있는 연락처(Contact) 클래스를 확장하는 클래스
 * 이메일만 추가
 * 
 * 확장의 대상이 되는 클래스에 생성자가 존재할 경우
 * 확장을 하는 클래스에서 반드시 해당 생성자를 호출해주어야 한단
 */

public class EmailContact extends Contact{

	private String email;
	
	
	
	public EmailContact(String name, String phone, String email) {
		super(name, phone);
		this.email = email;

	}

	public String getEmail() {
		return email;
	}

	@Override
		public void printContact() {
			
			super.printContact();
			System.out.println(" , 이메일 : " + this.email);
		}
	
	
	
	
	
}
