package com.ktdsuniversity.edu.abstractclass.quest.interfaceex;

public interface BoardInterface {

	void createPost(String title, String author, String content);
    void displayAllPosts();
    void displayPost(int postNumber);
    void updatePost(int postNumber, String title, String author, String content);
    void deletePost(int postNumber);
    int getPostCount();
    void addComment(int postNumber, String commentAuthor, String commentContent);
	
}
