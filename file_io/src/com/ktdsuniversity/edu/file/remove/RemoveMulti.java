package com.ktdsuniversity.edu.file.remove;

import java.io.File;

public class RemoveMulti {

	public void removeAllFiles(File removeDir) {
		
			if(removeDir.exists() && removeDir.isDirectory()) { // 파일이 존재하고 && 파일 타입이 디렉토리인가
					
				File[] itemInremoveDir =  removeDir.listFiles(); // removeDir 이 디렉토리이면 removeDir 밑에 파일들을 file[] 담는다
				
				for(File item : itemInremoveDir) { //foreach 로 file들을 하나씩 꺼낸다
					
					if(item.isDirectory()) { // 꺼낸 파일이 디렉토리인가?
						removeAllFiles(item); // Recursive Call (재귀호출) => 다시 explorer 함수를 호출하고 꺼낸 item 을 다시전달해 바놉ㄱ한다
					}
					else {
						item.delete();// 꺼낸파일이 디렉토리가 아니면 파일의 절대주소를 출력한다
					}
				}
				
				removeDir.delete();
			}
			else if(removeDir.exists() && removeDir.isFile()) { //매개변수에 전달한 removeDir이 파일이면 절대주소를 출력한다
				System.out.println(removeDir.getAbsolutePath());
			}
			
	}
	
	
	
	public static void main(String[] args) {
		RemoveMulti removeMulti = new RemoveMulti();
		
		File removeDir = new File("C:\\java1");
		
		removeMulti.removeAllFiles(removeDir);
	}
}
