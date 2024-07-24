package com.ktdsuniversity.edu.array;

import java.util.Scanner;

public class ClassRoomMain {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력해주세요.");
		
		int person = sc.nextInt();
		
		Student stu = new Student(person);

		
	}
}
