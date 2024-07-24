package com.ktdsuniversity.edu.game;

import java.util.Scanner;



/*
 * public static void rule() {
		Scanner sc = new Scanner(System.in);
		
		String startWord = "자전거";
		int count = 0;
		
		while(true) {
			System.out.print(startWord.substring(startWord.length()-1) + " 로 시작하는 3글자이상의 단어를 입력하시오 : ");
			
			String nextWord = sc.next();
			if(nextWord.startsWith(startWord.substring(startWord.length()-1)) && nextWord.length() >= 3) {
				startWord = nextWord;
				count++;
				System.out.println(count + " 회 반복중");
				
				
			}else {
				System.out.println("조건에 맞지않는 답을 입력했으므로 게임을 종료합니다");
				break;
			}
			
		}//while
	}
 */

public class Game {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		GameInfo gameInfo = new GameInfo("자전거");
		
		System.out.println("시작단어는 .\"자전거\".입니다");
		
		while(true) {
		String nextWord = sc.nextLine();
		gameInfo.inputNextWord(nextWord);
		
		boolean isEnoughLength = gameInfo.isEnoughLength();
		if(!isEnoughLength) {
			break;
		}
		
		boolean isStartLength = gameInfo.isStartLetter();
		
		if(!isStartLength) {
			break;
		}
		
		gameInfo.addCount();
		gameInfo.changeCurrentWord();
		
		}
		
		gameInfo.gameOver();
	}

}
