package com.ktdsuniversity.edu.abstractclass.quest;

import java.util.Date;
import java.util.Scanner;

import com.ktdsuniversity.edu.abstractclass.quest.interfaceex.BoardComment;
import com.ktdsuniversity.edu.abstractclass.quest.interfaceex.BoardPost;


public class BoardPostImpl implements BoardPost{

	protected int postNumber; //게시글 번호
    protected String title; // 게시글 제목
    protected String author; //게시글 작성자
    protected Date date; // 게시글 날짜
    protected int views; // 게시글 조회수
    protected String content; // 게시글 내용
    protected BoardComment[] comments; // 게시글 
    protected boolean isDeleted; // 게시글 삭제 여부
    protected BoardPostImpl[] posts;
    protected int postCount; // 게시글 갯수
    
    
    

    public BoardPostImpl(int postNumber, String title, String author, String content) {
        this.postNumber = postNumber;
        this.title = title;
        this.author = author;
        this.date = new Date();
        this.views = 0;
        this.content = content;
        this.comments = new BoardComment[10];
        this.isDeleted = false;
        
        this.posts = new BoardPostImpl[10];
        
        
    }

    
    public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		
	}
    
    
    
    
    
    
    @Override
    public String toString() {
        return "게시물번호: " + postNumber + "\n제목: " + title + "\n작성자: " + author + "\n날짜: " + date + "\n조회수: " + views + "\n내용: " + content + "\n삭제여부: " + isDeleted;
    }

	







	@Override
	public void createPost(String title, String author, String content) {
		if (title == null || title.trim().isEmpty()) {
        	System.out.println("제목은 필수로 입력해야 합니다");
            title = "";
        }

        if (title.length() > 30) { // 제목의 길이가 30개보다 크면 알림뜸
            System.out.println("제목은 30글자 내로 작성해야 합니다.");
            return;
        }

        posts[postCount] = new BoardPostImpl(postCount, title, author, content); 
        postCount++; // 게시글 번호 자동추가
		
	}


	@Override
	public void displayAllPosts() {
		
		
	}


	@Override
	public void displayPost(int postNumber) {
		
		
	}


	@Override
	public void updatePost(int postNumber, String title, String author, String content) {
		
		
	}


	@Override
	public void deletePost(int postNumber) {
		
		
	}

	@Override
	public int getPostCount() {
		
		return 0;
	}
    
    
	public int getPostNumber() {
		return this.postNumber;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public Date getDate() {
		return this.date;
	}

	public int getViews() {
		return this.views;
	}

	public String getContent() {
		return this.content;
	}

	public BoardComment[] getComments() {
		return this.comments;
	}

	public boolean isDeleted() {
		return this.isDeleted;
	}
}
