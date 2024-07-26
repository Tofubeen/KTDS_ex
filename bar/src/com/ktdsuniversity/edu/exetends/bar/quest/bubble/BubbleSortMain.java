package com.ktdsuniversity.edu.exetends.bar;

public class BubbleSortMain {

	public static void main(String[] args) {
		
		
		BubbleSort bubble = new BubbleSort(); // 인스턴스가 생성되면서 랜덤한 값이 입력된 배열이 생성됩니다
		
		bubble.printNotYetSorting(); // 아직 정렬되지 않은 배열에 값들이 출력됩니다
		
		bubble.bubbleSort(); // 배열을 오름차순 정렬합니다
		
		bubble.printBubbleSorting(); // 정렬된 배열과 최대 스위칭한 횟수를 출력합니다
		
	}
}
