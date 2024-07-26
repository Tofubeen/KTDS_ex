package com.ktdsuniversity.edu.exetends.bar;

import java.util.Random;

/*
 * 배열의 내용을 정렬하세요. (7월 26일 09시에 리뷰 진행합니다.)
	정수형 타입의 배열을 만드세요.
	배열의 크기는 30으로 합니다.
	각 배열의 인덱스에는 0보다 큰 랜덤한 숫자가 들어가야 합니다.
	정렬되지 않은 배열의 내용들을 모두 출력합니다.
	배열의 내용들을 오름차순 정렬합니다. 정렬 알고리즘 참고
	오름차순 정렬된 배열의 내용을 모두 출력합니다.
 */
public class BubbleSort {

	
	private int[] arrayInt;
	
	private final int ARRAY_SIZE = 30;
	
	private final int MAX_NUMBER = 100; // 100까지의 랜덤한 숫자를 생성하기 위한 상수
	
	private int maxCount; //총 스위칭한 횟수
	
	
	
	
	public BubbleSort() { // 기본 생성자 호출하며 Random 함수로 생성한 정수를 넣은 정수 배열 생성
		Random ran = new Random();
		this.arrayInt = new int[ARRAY_SIZE];
		
		for(int i = 0 ; i<arrayInt.length ; i++) {
			int num = ran.nextInt(MAX_NUMBER);
			
			this.arrayInt[i] = num;
		}
		
	}
	
	
	
	public void bubbleSort() {
		
		while(true) {
			
			int count = 0; //회차마다 스위칭한 횟수 , 스위칭 횟수가 0이되면 정렬이 완료되었다는 의미이고 while문을 빠져나오며 정렬이 종료된다
			
			for(int i = 0 ; i<arrayInt.length - 1; i++) {
				
				if(arrayInt[i] > arrayInt[i+1]) { // i번째가 ㅑ+1번째 보다 클때만 스위칭하고 동일할시에는 스위칭을 하지않습니다
					int saveNum = arrayInt[i];
					arrayInt[i] = arrayInt[i+1];
					arrayInt[i+1] = saveNum;
					count++;
				}
				
			}
			
			this.maxCount += count; // 매 회차마다 스위칭한 횟수를 maxCount에 저장하여 총 스위칭한 횟수를 구합니다
			
			if(count == 0) { // 스위칭한 횟수가 없을시 오름차순 정렬이 완료되었다 판단하고 while문을 종료합니다
				break;
			}
			
			
		}
	}
	

	public void printNotYetSorting() {
		System.out.println("-------------------------------------------------------------");
		for(int i = 0 ; i<this.arrayInt.length ; i++) {
			System.out.println((i + 1) + "번째 정수는 '" + this.arrayInt[i] + "' 입니다");
		}
		System.out.println("-------------------------------------------------------------");
	}

	public void printBubbleSorting() {
		System.out.println("-------------------------------------------------------------");
		for(int i = 0 ; i<this.arrayInt.length ; i++) {
			System.out.println("정렬된 배열에 '" + (i + 1) + "'번째 정수는 '" + this.arrayInt[i] + "' 입니다");
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("한 회차에 최대 정렬 시도한 횟수는 '" + this.maxCount + "'번 입니다");
			
	}
	
	
}
