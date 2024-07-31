package com.ktdsuniversity.edu.recursive;

public class RecursiveCallExam {

	
	
	public void call(int count) {
		//재귀 호출이 콜 스택이 한도만큼 쌓이면 애플리케이션을 강제로 죽인다
		//멀티쓰레드 환경에서 CPU Idle 타입을 모두 독점한다
		System.out.println("call 메소드가 호출되었습니다" + count + "번째" );
		if(count < 10) {
			call(count+1);
			
		}
		
	}
	
	public static void main(String[] args) {
		RecursiveCallExam callExam = new RecursiveCallExam();
		callExam.call(0);
	}
}
