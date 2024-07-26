package com.ktdsuniversity.edu.abstractclass;

import java.util.Random;

public class CheckFileTypeAndMimeType extends AbstractFileTypeChecker{

	

	public CheckFileTypeAndMimeType(String fileName) {
		super(fileName);
		
	}
	
	
	
	@Override
	public boolean compareType() {
		// TODO Auto-generated method stub
		return isJpegFile() && isImageMimeType();
	}
	
	
	
	private boolean isJpegFile() {
		
		return this.fileName.toLowerCase().endsWith(".jpg");
	}
	
	
	private boolean isImageMimeType() {
		
		String mimeTypeOfFile = getMimeTypeOfFile();
		
		boolean isImageFile = mimeTypeOfFile.equals("image/jpeg")
												|| mimeTypeOfFile.equals("image/gif");
		System.out.println(fileName + "의 mimeType 은 " + mimeTypeOfFile + " 입니다");
		
		return isImageFile;
	}
	
	private String getMimeTypeOfFile() {
		String[] mimeTypes = {"image/jpeg" ,"image/gif" , "audio/mp3" , "videp/avi" };
		
		Random ran = new Random();
		return mimeTypes[ran.nextInt(mimeTypes.length)];
	}
	
}
