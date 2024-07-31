package com.ktdsuniversity.edu.abstractclass.quest;

import java.util.Date;

import com.ktdsuniversity.edu.abstractclass.quest.interfaceex.BoardComment;

public class BoardCommentImpl implements BoardComment{

	protected int commentNumber; // 댓글 번호
    protected String content; // 내용 
    protected String author; // 작성장
    protected Date date; // 날짜

    public BoardCommentImpl(int commentNumber, String content, String author) {
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
        return "댓글번호: " + commentNumber + "\n내용: " + content + "\n작성자: " + author + "\n날짜: " + date;
    }



	@Override
	public void addComment(int postNumber, String commentAuthor, String commentContent) {
		// TODO Auto-generated method stub
		
	}
}
