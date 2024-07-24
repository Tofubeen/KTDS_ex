package com.ktdsuniversity.edu.game.quest;


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
public class FirstGameInfo {

public final int WORD_LENGTH = 2;
	
	
	private String inputWord;
	
	private int inputWordLength;
	
	private String startLatter;
	
	private String totalWord;
	
	
	private int gameCount = 0;
	
	public void inputStringBuffer(StringBuffer sb) {
		this.totalWord = sb.toString();
	}
	
	
	
	public FirstGameInfo(String startLatter) {
	
		this.startLatter = startLatter;
	}
	
	public void inputNextWord(String inputWord) {
		this.inputWord = inputWord;
		this.inputWordLength = this.inputWord.length();
	}
	
	
	
	public String getStartLatter() {
		return startLatter;
	}



	public boolean isEnoughLength() {
		
		return this.inputWordLength > this.WORD_LENGTH;
	}
	
	public boolean isStartLetter() {
		
		return this.inputWord.startsWith(this.startLatter);
		
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
