package com.ktdsuniversity.edu.array;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		int[] scoreArray = new int[7];
		int sum = 0 ;
		
		//배열 인덱스에 값 할당
		for(int i = 0 ; i<scoreArray.length ;i++) {
			scoreArray[i] = sc.nextInt();
			sum += scoreArray[i];
		}
		
		for(int i = 0 ; i<scoreArray.length ;i++) {
			System.out.print(scoreArray[i] + "\t");
		}
			System.out.println("합계: " + sum);
		
		
		String[] nameArray = new String[7];
		
		
		
		
	}
}
