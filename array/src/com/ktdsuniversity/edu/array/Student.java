package com.ktdsuniversity.edu.array;

import java.util.Random;

public class Student {

	private int[] student;
	
	private int persons;
	
	private int sum;
	private double avg;
	private double courceCredit;
	private String rank;
	
	public Student(int persons) {
		super();
		this.persons = persons;
		this.student = new int[persons];
		
		Random ran = new Random();
		
		for(int i =0; i<this.student.length ; i++) {
			student[i] = ran.nextInt(100); 
			
		}
		
		getSumAllScores();
		getAverage();
		getCourseCredit();
		getABCDE();
		printStudent();
	}
	
	public int getSumAllScores() {
		
		
		for(int i = 0; i<this.student.length ; i++) {
			this.sum += student[i];
		}
		return this.sum;
		
	}
	
	public double getAverage() {
		
		this.avg = (double)this.sum / (double)this.persons;
		return this.avg;
	}
	
	public double getCourseCredit() {
		
		this.courceCredit = (double)((this.avg / 100) * 4.5) ;
		
		return this.courceCredit;
	}
	
	public String getABCDE() {
        if (this.courceCredit >= 4.0) {
            return this.rank = "A";
        } else if (this.courceCredit >= 3.0) {
            return this.rank = "B";
        } else if (this.courceCredit >= 2.0) {
            return this.rank = "C";
        } else if (this.courceCredit >= 1.0) {
            return this.rank = "D";
        } else {
            return this.rank = "E";
        }
 }
	private void printStudent() {
		
		System.out.println("전체 학생수는  " + this.persons + " 입니다 ");
		System.out.println("합계 : " + this.sum);
		System.out.println("평균 : " + this.avg);
		System.out.println("학점 : " + this.courceCredit);
		System.out.println("등급 : " + this.rank);
	}
	
	
	
	
	
	

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}





	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	
	
	
	
	
	
}
