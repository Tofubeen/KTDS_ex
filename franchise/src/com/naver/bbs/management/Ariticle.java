package com.naver.bbs.management;

import com.naver.member.management.Member;

public class Ariticle {

	//제목
	String title;
	//내용
	String description;
	//게시글 작성자 정보
	Member author;
	
	
	public static void main(String[] args) {
		
		Ariticle newAriticle = new Ariticle();
		newAriticle.title = "새로운 게시글";
		newAriticle.description = "게시글의 내용";
		
		Member articleAuthor = new Member("userId", "사용자");
		newAriticle.author = articleAuthor;
		
		System.out.println("게시글 제목 : " + newAriticle.title);
		System.out.println("게시글 내용 : " + newAriticle.description);
		System.out.println("게시글 작성자 ID : " + newAriticle.author.getId());
		System.out.println("게시글 작성자 이름 : " + newAriticle.author.getName());
		
		newAriticle.author.setId("찰스");
		System.out.println(newAriticle.author.getId());
		
		
	}
	
}
