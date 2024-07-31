package com.ktdsuniversity.edu.file_io.input.exeplorer;

import java.io.File;

public class FileSystemExeplorer {

	/**
	 * 지정한 경로 아래에 있는 모든 파일들의 전체 경로를 출력
	 * @param dir: ㅣ 지정한 경로
	 */
	public void exeplorer(File dir) {
		if(dir.exists() && dir.isDirectory()) { // 파일이 존재하고 && 파일 타입이 디렉토리인가
				
			File[] itemInDir =  dir.listFiles(); // dir 이 디렉토리이면 dir 밑에 파일들을 file[] 담는다
			
			for(File item : itemInDir) { //foreach 로 file들을 하나씩 꺼낸다
				
				if(item.isDirectory()) { // 꺼낸 파일이 디렉토리인가?
					exeplorer(item); // Recursive Call (재귀호출) => 다시 explorer 함수를 호출하고 꺼낸 item 을 다시전달해 바놉ㄱ한다
				}
				else {
					System.out.println(item.getAbsolutePath());// 꺼낸파일이 디렉토리가 아라면 파일의 절대주소를 출력한다
				}
			}
		}
		else if(dir.exists() && dir.isFile()) { //매개변수에 전달한 dir이 파일이면 절대주소를 출력한다
			System.out.println(dir.getAbsolutePath());
		}
		
	}
	
	public static void main(String[] args) {
		
		FileSystemExeplorer fse = new FileSystemExeplorer();//
		File dir = new File("C:\\dev\\java_workspace");
		fse.exeplorer(dir);
		
		
	}
}
