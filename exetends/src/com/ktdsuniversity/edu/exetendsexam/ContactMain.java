package com.ktdsuniversity.edu.exetendsexam;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact[] contactArray = new Contact[4];
		contactArray[0] = new Contact("민창", "010-1234-5678");
		contactArray[1] = new Contact("mj", "010-1254-7845");
		contactArray[2] = new Contact("피터 파커", "010-4545-7878");
		contactArray[3] = new Contact("팀 쿡", "010-5654-7845");
		contactArray[4] = new EmailContact("김", "010-2800-5689", "kim@korea.com");

		
		
		for (int i =0 ; i<contactArray.length ; i++) {
			contactArray[i].printContact();
			
			if(contactArray[i] instanceof EmailContact) { //컨택트어레이 배열 내에 인스턴스 타입이 EmailContact 있는걸 찾는 논리연산자 contactArray[4]만 true 나머지는 false
				EmailContact emailContactInstance = (EmailContact)contactArray[i];
//				emailContactInstance.se 
				
			}
		}
		
		
		
		
//		Contact minChang = new Contact("민창", "010-1234-5678");
//		minChang.printContact();
//		
//		Contact mj = new Contact("mj", "010-1254-7845");
//		mj.printContact();
		
		
	}
}
