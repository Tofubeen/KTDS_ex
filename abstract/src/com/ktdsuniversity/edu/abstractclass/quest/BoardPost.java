package com.ktdsuniversity.edu.abstractclass.quest;

import java.util.Date;

public class BoardPost {

	protected int postNumber;
    protected String title;
    protected String author;
    protected Date date;
    protected int views;
    protected String content;
    protected BoardComment[] comments;
    protected boolean isDeleted;
    

    public BoardPost(int postNumber, String title, String author, String content) {
        this.postNumber = postNumber;
        this.title = title;
        this.author = author;
        this.date = new Date();
        this.views = 0;
        this.content = content;
        this.comments = new BoardComment[10];
        this.isDeleted = false;
    }

    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "게시물번호: " + postNumber + "\n제목: " + title + "\n작성자: " + author + "\n날짜: " + date + "\n조회수: " + views + "\n내용: " + content + "\n삭제여부: " + isDeleted;
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
