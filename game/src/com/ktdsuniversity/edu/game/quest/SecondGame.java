package com.ktdsuniversity.edu.game.quest;

import java.util.Scanner;


	/*
	 * 1.게임을 시작할 첫 단어를 넣어줄 생성자를 선언한다
	 * 2.스캐너를 선언한다
	 * 3.마지막 단어를 출력한다
	 * 4.반복문을 선언하고 조건은 true로 설정한다
	 * 5.단어를 입력할 변수를 선언
	 * 6.단어를 단어를 객체에 담는다
	 * 7.길어를 검사할 메소드를 실행하고 결과값을 받을 변수선언 , 변수값이 false일 경우 반복문을 종료시킨다 
	 * 8.마지막 단어가 "기" 로 끝나는지 검사할 메소드를 실행하고 결과값을 받을 변수선언 , 변수값이 false일 경우 반복문을 종료시킨다 
	 * 10. 반복문이 종료될 경우 카운트를 출력하면서 게임을 종료한다는 메시지를 출력한다
	 */


	public class SecondGame {

		public static void main(String[] args) {
			
			SecondGameInfo sgi = new SecondGameInfo("기");
			Scanner sc = new Scanner(System.in);
			StringBuffer sb = new StringBuffer(); 
			System.out.println("게임을 시작할 마지막 단어는 " + sgi.getEndLatter() + " 입니다");
			
			while(true) {
				String gameWord = sc.nextLine();
				
				sgi.inputNextWord(gameWord);
				
				boolean isEnoughLength = sgi.isEnoughLength();
				if(!isEnoughLength) {
					break;
				}
				
				boolean isStartLetter = sgi.isEndLetter();
				
				if(!isStartLetter) {
					break;
				}
				
				sb.append(gameWord + "\n");
				sgi.addCount();
				
			} // while
			sgi.inputStringBuffer(sb);
			
			sgi.gameOver();
			
			
		}
	}
