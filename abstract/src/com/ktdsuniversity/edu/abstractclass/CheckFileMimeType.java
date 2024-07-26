package com.ktdsuniversity.edu.abstractclass;

import java.util.Random;

public class CheckFileMimeType extends AbstractFileTypeChecker{



	public CheckFileMimeType(String fileName) {
		super(fileName);
	}
	
	
	private String getMimeTypeOfFile() {
		String[] mimeTypes = {"image/jpeg" ,"image/gif" , "audio/mp3" , "videp/avi" };
		
		Random ran = new Random();
		return mimeTypes[ran.nextInt(mimeTypes.length)];
	}
	
	
	
	/**
	 * 추상클래스에 포함되어있는 추상메소드는
	 * 서브 클래스에서 빈드시 오버라이딩 해야한다
	 */


	@Override
	public boolean compareType() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
