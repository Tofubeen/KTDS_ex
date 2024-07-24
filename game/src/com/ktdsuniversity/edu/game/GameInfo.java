package com.ktdsuniversity.edu.game;

import java.util.Scanner;

public class GameInfo {

	public final int WORD_LENGTH = 3;
	
	
	private String currentWord;
	
	private String lastLatter;
	
	private String nextWord;
	
	private int gameCount = 0;
	
	private int nextWordLength;
	
	
	
	
	
	public GameInfo(String currentWord) {
	
		this.currentWord = currentWord;
		this.lastLatter = this.currentWord.substring(currentWord.length()-1);
	}
	
	
	public void inputNextWord(String nextWord) {
		this.nextWord = nextWord;
		this.nextWordLength = this.nextWord.length();
	}
	
	public boolean isEnoughLength() {
		
		return this.nextWordLength >= this.WORD_LENGTH;
	}
	
	public boolean isStartLetter() {
		
		return this.nextWord.startsWith(this.lastLatter);
		
	}
	
	
	public void changeCurrentWord() {
		this.currentWord = this.nextWord;
		this.lastLatter = this.currentWord.substring(currentWord.length()-1);
	}
	
	public void addCount() {
		this.gameCount = this.gameCount+1;
	}
	
	public void gameOver() {
		
		System.out.println("게임이 종료되었습니다");
		System.out.println("이어나간 게임 단어의 수는 " + this.gameCount + " 번 입니다");
	}
	
	
	

	
	
	
}
