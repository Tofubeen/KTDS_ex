package com.ktdsuniversity.edu.file.io.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileOutPutExam {

	public static void main(String[] args) {
		
		//파일쓰기 ==> 폴더생성
		
		//1.어디에 어떤 파일을 쓸 것인지 정의
		File file = new File("C:\\Users\\User\\Desktop\\java","java_output.txt");
		
		
		//2. 파일을 쓰려는 경로가 존재하는가
		if( ! file.getParentFile().exists()) {
			//존재하지 않는다면 경로를 생성 ( 폴더를 생성 )
			file.getParentFile().mkdir(); // 전체 경로가 생성
		}
		
		//3. 쓰려는 파일이 이미 존재하는가 ?
		int index = 1; 
		while(file.exists()) {
			//존재한다면 중복되지 않는 이름을 찾는다
			String filename =  file.getName(); // 파일의 이름 (확장자 포함)
			
			//파일의 이름에 순번을 부여하고 싶다 (예> java_output (1).txt)
			//3-1 파일의 이름에서 확장자를 분리한다
			String fileNameWithoutExtention = filename.substring(0, filename.lastIndexOf(".")); // 확장자를 제외한 순수한 파일명만 저장됨
			String exetention = filename.substring(filename.lastIndexOf("."));
			
			//3-2 확장자가 분리된 파일의 이름에 순번을 부여한다
			fileNameWithoutExtention += " (" + (index++) + ") ";
			
			
			//3-3 확장자와 파일의 이름을 연결한다
			filename = fileNameWithoutExtention + exetention;
			
			file = new File(file.getParentFile() , filename);
		}
		
		//4. 중복되지 않는 파일에 내용을 작성한다.
		List<String> fileDescription = new ArrayList<String>();
		fileDescription.add("하나");
		fileDescription.add("둘");
		fileDescription.add("셋");
		fileDescription.add("넷");
		fileDescription.add("다섯");
		fileDescription.add("여섯");
		fileDescription.add("일곱");
		
		try {
			Files.write(file.toPath(), fileDescription, Charset.defaultCharset());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(file.getAbsolutePath());
	}
}
