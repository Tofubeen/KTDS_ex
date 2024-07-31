package com.ktdsuniversity.edu.abstractclass.quest;

import java.util.Date;

import com.ktdsuniversity.edu.abstractclass.quest.interfaceex.BoardComment;

public class posts {

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
}
