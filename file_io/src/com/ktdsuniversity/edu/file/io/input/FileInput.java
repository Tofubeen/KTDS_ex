package com.ktdsuniversity.edu.file.io.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileInput {

	public static void main(String[] args) {
		
		//1. 읽을 파일의 객체를 생성
		//Windows
		File file = new File("C:\\Users\\User\\Desktop\\java Exam", "java Exam.txt");
		//MacOS
//		File file = new File("C:Java Exam", "java Exam.txt");
		
		//2. 읽을 파일이 존재하는가 검사 && 읽을 파일이 파일 타입인지 검사
		if(file.exists() && file.isFile()) {
			//3. 파일을 읽어서 출럭
			FileReader reader = null;
			BufferedReader bufferedReader = null;
			
			try {
				//파일을 바이트로 읽어옴
				reader = new FileReader(file , Charset.forName("UTF-8"));
				
				//파일을 라인단위로 읽어옴
				bufferedReader = new BufferedReader(reader);
				
				//파일 읽기 준비 끝
				
				//파일 읽기 시작
				String line = null;
				
				//파일의 내용을 한 줄씩 읽어서 파일의 끝까지 출력한다
				while( (line = bufferedReader.readLine()) != null) {
					System.out.println(line);
					
				}
				
				//파일 읽기 끝
			} 
			catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();

			}finally {
				//finally 는 예외가 던져지던 안던져지던 반드시 한번은 수행되는 영역
				//보통 pipe 를 닫을때 사용
				//Pipe 는 연 순서의 역순으로 닫는다
				//4. 파이프를 닫는 코드
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
						e.printStackTrace();
					}
					
					if(reader != null) {
						try {
							reader.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		//4. 파이프를 닫는 코드
		
	}
}
