package com.ktdsuniversity.edu.file.io.input;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Article {

	
	private int articleNumber;
	private String title;
	private String description;
	private String author;
	private int viewCount;
	
	
	public Article(String line) {
		String[] lineArray =  line.split("\\|");
		this.articleNumber = Integer.parseInt(lineArray[0]);
		this.title = lineArray[1];
		this.description = lineArray[2];
		this.author = lineArray[3];
		this.viewCount = Integer.parseInt(lineArray[4]);;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("번호 : " + this.articleNumber);
		sb.append("\n제목 : " + this.title);
		sb.append("\n내용 : " + this.description);
		sb.append("\n작성자 : " + this.author);
		sb.append("\n조회수 : " + this.viewCount);
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
//		String line = "1|첫번째 게시글입니다|첫번째 게시글의 내용입니다|배권혁|12";
//		Article article = new Article(line);
//		System.out.println(article);
		
		//1. article.txt 파일을 인스턴스로 가져온다
		File file = new File("C:\\Users\\User\\Desktop\\java Exam" , "Article.txt");
		
		//2. list<Article> 인스턴스를 정의한다 
		if(file.exists() && file.isFile()) {
			List<Article> articles = new ArrayList<>();
			
			
			try {
				//3. article 파일을 files.readAllLine() 을 통해 읽는다
				List<String> list = Files.readAllLines(file.toPath(), Charset.defaultCharset());// 한 라인씩 읽어서 list에 담는다 
				
				//4. 읽어온 결과를 List<article> 에 add 한다 
				for(String str : list) {
					Article article = new Article(str);
					articles.add(article);
				}	
				//5. List<Article> 를 모두 출력한다
				
			} 
				catch (IOException e) {
				
				e.printStackTrace();
			}
			
			if(articles != null) {
				
				for(Article article : articles) {
					System.out.println(article);
					System.out.println();
				}
			}
			}
			
		}
		
	}
	
	
	

