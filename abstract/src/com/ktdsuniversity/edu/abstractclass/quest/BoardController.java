package com.ktdsuniversity.edu.abstractclass.quest;


import com.ktdsuniversity.edu.abstractclass.quest.interfaceex.BoardComment;
import com.ktdsuniversity.edu.abstractclass.quest.interfaceex.BoardInterface;



public class BoardController{
	
	
	
	
	
	
	
	
	
    public static void main(String[] args) {
    	
    	BoardInterface board = new BoardInterface() { //BoardInterface 의 인스턴스 생성하며 익명클래스 작성
    		
            BoardPostImpl[] posts = new BoardPostImpl[10]; // post 갯수
            int postCount = 0; // 게시글 갯수

            @Override
            public void createPost(String title, String author, String content) { //게시글 작성
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
                for (BoardPostImpl post : posts) {
                    if (post != null && !post.isDeleted) {
                        int commentCount = 0;
                        for (BoardComment comment : post.comments) {
                            if (comment != null) {
                                commentCount++;
                            }
                        }
                        System.out.println(post.title + " (" + commentCount + " comments)");
                    }
                }
            }

            @Override
            public void displayPost(int postNumber) {
                if (postNumber >= postCount || posts[postNumber].isDeleted) {
                    System.out.println("삭제된 게시글입니다");
                    return;
                }

                BoardPostImpl post = posts[postNumber];
                post.views++;
                System.out.println(post);

                for (BoardComment comment : post.comments) {
                    if (comment != null) {
                        System.out.println(comment);
                    }
                }
            }

            @Override
            public void updatePost(int postNumber, String title, String author, String content) {
                if (postNumber >= postCount || posts[postNumber].isDeleted) {
                    System.out.println("이미 삭제되어 수정 할 수 없습니다");
                    return;
                }

                BoardPostImpl post = posts[postNumber];
                post.title = title;
                post.author = author;
                post.content = content;
            }

            @Override
            public void deletePost(int postNumber) { 
                if (postNumber < postCount) {
                    posts[postNumber].isDeleted = true;
                }
            }

            @Override
            public int getPostCount() {
                int count = 0;
                for (BoardPostImpl post : posts) {
                    if (post != null && !post.isDeleted) {
                        count++;
                    }
                }
                return count;
            }

            @Override
            public void addComment(int postNumber, String commentAuthor, String commentContent) {
                if (postNumber >= postCount || posts[postNumber].isDeleted) {
                    System.out.println("이미 삭제된 게시물엔 댓글을 달수없습니다");
                    return;
                }

                BoardPostImpl post = posts[postNumber];
                for (int i = 0; i < post.comments.length; i++) {
                    if (post.comments[i] == null) {
                        post.comments[i] = new BoardCommentImpl(i, commentContent, commentAuthor);
                        return;
                    }
                }
                System.out.println("댓글을 더이상 등록할 수 없습니다");
            }
        };
        
        //---------------------------------------------------------------------------------------------------
        
        
        
        
        
        
        
        
        board.createPost("제목", "kim", "첫번째 글");
        board.createPost("2", "Park", "두번째 글");
        board.displayPost(0);
        System.out.println("총 게시물 갯수: " + board.getPostCount());
    }
}

