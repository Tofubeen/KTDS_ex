package com.ktdsuniversity.edu.exceptions.custom;

public class Site {

	public static void main(String[] args) {
		
		MemberRegister register = new MemberRegister();
		Member member = new Member("id", null, "1234");
		
		try {			
			boolean registResult =  register.regist(member);
		} catch (EmptyRegistInfoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
}
