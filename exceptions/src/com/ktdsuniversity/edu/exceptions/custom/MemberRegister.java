package com.ktdsuniversity.edu.exceptions.custom;

public class MemberRegister  {

	public boolean regist(Member member) {
		
		// 입력값 검증 
		if(member == null) {
			throw new EmptyRegistInfoException("가입정보가 없습니다");
		}//예외가 던져지는 순간 하위에 코드들은 실행이 되지 않는다
		
		if(member.getUserId() == null) {
			throw new EmptyRegistInfoException("아이디는 필수값입니다 올바르게 입력해주세요");
		}
		if(member.getUserName() == null) {
			throw new EmptyRegistInfoException("이름은 필수값입니다 올바르게 입력해주세요");
		}
		
		if(member.getPassword() == null) {
			throw new EmptyRegistInfoException("패스워드는 필수값입니다 가입버튼을 누르기전에 중복 확인도 빠짐없이 확인해주세요");
		}
		
		

		//TODO 회원가입 처리하기
		
		return true;
	}
	
	
}
