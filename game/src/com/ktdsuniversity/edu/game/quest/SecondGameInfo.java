package com.ktdsuniversity.edu.game.quest;

public class SecondGameInfo {

public final int WORD_LENGTH = 2;
	
	
	private String inputWord;
	
	private int inputWordLength;
	
	private String endLatter;
	
	private String totalWord;
	
	private int gameCount = 0;
	
	
	
	
	
	public SecondGameInfo(String endLatter) {
	
		this.endLatter = endLatter;
	}
	
	public void inputNextWord(String inputWord) {
		this.inputWord = inputWord;
		this.inputWordLength = this.inputWord.length();
	}
	
	public void inputStringBuffer(StringBuffer sb) {
		this.totalWord = sb.toString();
	}
	
	
	
	public String getEndLatter() {
		return endLatter;
	}


	public boolean isEnoughLength() {
		
		return this.inputWordLength > this.WORD_LENGTH;
	}
	
	public boolean isEndLetter() {
		
		return this.inputWord.endsWith(this.endLatter);
		
	}
	
	
	public void addCount() {
		this.gameCount = this.gameCount+1;
	}
	
	public void gameOver() {
		
		System.out.println("게임이 종료되었습니다");
		System.out.println("이어나간 게임 단어의 수는 " + this.gameCount + " 번 입니다");
		System.out.println("이어나간 단어들은 \n" + this.totalWord + " \n입니다");
	}
}
