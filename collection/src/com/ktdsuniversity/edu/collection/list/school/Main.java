package com.ktdsuniversity.edu.collection.list.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생기록부입니다 이름과 자바 , 프론트 성적을 입력 받겠습니다");
		
		List<Student>students = new ArrayList<Student>();
		
		
			System.out.print("학생의 이름을 입력해주세요 :");
			String name = sc.nextLine();
			System.out.print("학생의 자바 성적을 입력해주세요 :");
			int java = sc.nextInt();
			System.out.print("학생의 프론트 성적을 입력해주세요 :");
			int front = sc.nextInt();
			
			Student student = new Student(name, java, front);
			students.add(student);
			School school = new School(students);
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선택할 학생기록부의 기능을 선택해주세요");
		System.out.println("1.학생등록");
		System.out.println("2.학생찾기");
		System.out.println("3.학생정보삭제");
		System.out.println("4.모든 학생들의 총 점 보기");
		System.out.println("5.모든 학생들의 총 평균 보기");
		System.out.println("6.모든 학생들의 정보 보기.");
		System.out.println("9.종료하기");
	}
	
	
	public static void main(String[] args) {
		
		
			
			input();
			menu();
			
			
	
		
		
		
		
		
	}
}
