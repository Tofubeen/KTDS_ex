package com.ktdsuniversity.edu.abstractclass.quest;

import java.util.Date;

public class BoardComment {

	protected int commentNumber; // 댓글 번호
    protected String content; // 내용 
    protected String author; // 작성장
    protected Date date; // 날짜

    public BoardComment(int commentNumber, String content, String author) {
        this.commentNumber = commentNumber;
        this.content = content;
        this.author = author;
        this.date = new Date();
    }

    
    
    
    
    public int getCommentNumber() {
		return commentNumber;
	}





	public String getContent() {
		return content;
	}





	public String getAuthor() {
		return author;
	}





	public Date getDate() {
		return date;
	}





	@Override
    public String toString() {
        return "Comment Number: " + commentNumber + "\nContent: " + content + "\nAuthor: " + author + "\nDate: " + date;
    }
}
