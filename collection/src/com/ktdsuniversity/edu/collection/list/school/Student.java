package com.ktdsuniversity.edu.collection.list.school;

public class Student {

	private String name;
	private int javaScore;
	private int frontScore;
	
	
	public Student(String name, int javaScore, int frontScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.frontScore = frontScore;
	}
	
	public int getSumScore() {
		return this.javaScore + this.frontScore;
	}
	
	public double getAvgScore() {
		
		return (this.javaScore+this.frontScore)/2.0;
	}
	
	@Override
	public String toString() {
		String format = "이름 : %s , java : %d , Front : %d";
		return String.format(format,this.name ,this.javaScore,this.frontScore);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJavaScore() {
		return javaScore;
	}


	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}


	public int getFrontScore() {
		return frontScore;
	}


	public void setFrontScore(int frontScore) {
		this.frontScore = frontScore;
	}
	
	
	
	
	
	
	
	
}
