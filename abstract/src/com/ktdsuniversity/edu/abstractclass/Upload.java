package com.ktdsuniversity.edu.abstractclass;

public class Upload {

	public static void main(String[] args) {
		
		
		
		
		//1. 확장자만 체크하기
		AbstractFileTypeChecker checkFileType1 = new CheckFileType("pic.jpg");
		AbstractFileTypeChecker checkFileType2 = new CheckFileType("pic.xlsx");
		
		boolean isImageFile1 = checkFileType1.isImageFile();
		boolean isImageFile2 = checkFileType2.isImageFile();
		
		System.out.println(isImageFile1);
		System.out.println(isImageFile2);
		
		//2 mime 타입만 체크하기 
		AbstractFileTypeChecker checkFileMimeType1 = new CheckFileMimeType("pic.zip");
		AbstractFileTypeChecker checkFileMimeType2 = new CheckFileMimeType("pic.exe");
		
		boolean isImageFile3 =  checkFileMimeType1.isImageFile();
		boolean isImageFile4 =  checkFileMimeType2.isImageFile();
		
		System.out.println(isImageFile3);
		System.out.println(isImageFile4);
		//3 확장자와 mime 타입 모두 체크하기
		AbstractFileTypeChecker checkFileTypeAndMimeType1 = new CheckFileTypeAndMimeType("pic.jpg"); 
		AbstractFileTypeChecker checkFileTypeAndMimeType2 = new CheckFileTypeAndMimeType("pic.mp3");
		
		boolean isImageFile5 =  checkFileTypeAndMimeType1.isImageFile();
		boolean isImageFile6 =  checkFileTypeAndMimeType2.isImageFile();
		
		System.out.println(isImageFile5);
		System.out.println(isImageFile6);
		
	}
}
