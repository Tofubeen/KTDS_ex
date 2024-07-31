package com.ktdsuniversity.edu.exceptions;

public class ExceptionClassName {

	public static void main(String[] args) {
		
		try {
			Class.forName("someAclass");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("클래스를 찾을수가 없습니다");
			e.printStackTrace();
		}
		
	}
}
