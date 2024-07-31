package com.ktdsuniversity.edu.collection.list.school;

import java.util.ArrayList;
import java.util.List;

public class School {

	private List<Student> studentList;

	public School(List<Student> studentList) {
		//FIXME studentList 초기화
		this.studentList = new ArrayList<Student>();
	}
	
	public void removeStudent(int index) {
		//FIXME 해당 인덱스의 학생을 삭제
		studentList.remove(index);
		
	}
	
	public void getStudent(int index) {
		//FIXME 해당 인덱스의 학생을 반환
		System.out.println(studentList.get(index));
		
	}
	
	public void getSumScores() {
		int totalSum = 0;
		//FIXME 모든 학생들의 점수 총합 반환
		for(Student student : studentList) {
			totalSum += student.getSumScore();
		}
		System.out.println("모든 학생들의 점수 총 합은 : " + totalSum);
		
	}
	
	public void getAverageScores() {
		//FIXME 모든 학생들의 점수 평균 반환
		double totalAvg = 0.0;
		double count = 0;
		for(Student student : studentList) {
			totalAvg += student.getAvgScore();
			count++;
		}
		System.out.println("모든 학생들의 점수 평균은 : " + totalAvg/count);
		
	}
	
	@Override
	public String toString() {
		//FIXME 모든 학생들의 정보를 출력
		//student 클래스의 toString를 이용
		StringBuffer sb = new StringBuffer();
		
		for(Student student: studentList) {
			String str = student.toString();
			sb.append(str);
		}
		
		return sb.toString();
	}
	
	
	
	
}
