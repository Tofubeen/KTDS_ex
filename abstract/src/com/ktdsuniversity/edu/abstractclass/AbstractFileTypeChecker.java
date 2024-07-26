package com.ktdsuniversity.edu.abstractclass;

public abstract class AbstractFileTypeChecker {

	protected String fileName; //자기자신의 클래스와 상속받은 클래스에서만 쓸수있는 변수

	public AbstractFileTypeChecker(String fileName) {
		this.fileName = fileName;
	}
	
	
	public boolean isImageFile() {
		return compareType();
	}
	
	public abstract boolean compareType();
	
	
	
}
