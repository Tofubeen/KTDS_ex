package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.AdressBook;

public class AdressMain {

	public static void main(String[] args) {
		
		
		
		
		Kim kim = new Kim("김씨", "010-8584-5455", "서울 도봉구 방학동");
		kim.getName();
		kim.getPhoneNumber();
		kim.getAdress();
		
		Lee lee = new Lee("이씨", "010-4242-5655", "서울 도봉구 창동");
		lee.getName();
		lee.getPhoneNumber();
		lee.getAdress();
		
		Park park = new Park("박씨", "010-5686-5425", "서울 도봉구 도봉동");
		park.getName();
		park.getPhoneNumber();
		park.getAdress();
		
		
		AdressBook adressBook = new AdressBook() {
			
			@Override
			public void getPhoneNumber() {
				System.out.println("번호 모르겠다");
				
			}
			
			@Override
			public void getName() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void getAdress() {
				// TODO Auto-generated method stub
				
			}
		};
		adressBook.getPhoneNumber();
		
		
		
		
	}
}
