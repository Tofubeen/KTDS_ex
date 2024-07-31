package com.ktdsuniversity.edu.file.io.input;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class NewFileInput {

	public static void main(String[] args) {
		
		//1. 읽어들일 파일 인스턴스 생성
		File file = new File("C:\\Users\\User\\Desktop\\java Exam", "java Exam.txt");
		
		//2. 읽을 파일이 존재하는지 확인 && 읽을 파일이 파일 타입인지 확인
		if(file.exists() && file.isFile()) {
			//3. 파일을 읽어서 List에 할당
			List<String> fileLines = null;
			
			try {
				fileLines = Files.readAllLines(file.toPath() ,Charset.defaultCharset() ); //readAllLine에서 예외처리 필요
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			//4. List로 모두 출력
			if(fileLines != null) { // NullPointerException 대비를 위한 예외처리
				for(String line : fileLines) {
					System.out.println(line);
				}
			}
		}
		
	}
}
