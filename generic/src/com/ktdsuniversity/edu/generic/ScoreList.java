package com.ktdsuniversity.edu.generic;

import java.util.function.Function;

public class ScoreList<T> {

	
	
	private int size; 
	private Object[] scoreArray;
	
	public ScoreList() {
		this.scoreArray = new Object[2];
	}
	
	
	/**
	 * scoreArray 배열에 아이템을 추가한다
	 * 아이템이 추가될때마다 size 값은 하나씩 증가해야한다
	 * 
	 * 만약 size의 값이 배열의 길이보다 크거나 갇을경우 
	 * scoreArray 배열의 길이는 두 개씩 늘어나도록 한다
	 */
		
	public void add(T score) {
		
		
		if(this.size >= this.scoreArray.length) {
			//배열의 길이를 늘려준다
			Object[] tempScoreArray = new Object[this.scoreArray.length + 2 ];//tempScoreArray 새로운 변수생성
			//배열을 복사한다
			//this.scoreArray 의 0번 인덱스 부터 this.scoreArray.length 까지
			//tempScoreArray의 0번 인덱스를 시작으로 복사해준다
			System.arraycopy(scoreArray, 0, tempScoreArray, 0, this.scoreArray.length);
			
			this.scoreArray = tempScoreArray;
			//메모리를 교체한다
		}
		this.scoreArray[this.size++] = score;
		
		
	}
	
	public T get(int index) {
		if(index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException(index);
		}
		
		
		//this.scoreArray[index] 의 결과는 object 이므로 T타입으로 형 변환 해야한다
		return (T) this.scoreArray[index];
	}
	
	/**
	 * scoreArray 에 등록된 아이템의 개수를 반환
	 * @return
	 */
	public int getSize() {
		return this.size;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("scoreList[");
		
		for(Object score : this.scoreArray) {
			sb.append(score + " , ");
		}
		
		sb.append("]");
		return sb.toString();
	}
	
	public void forEach(Function<T, Integer> function) {
		int sum = 0;
		for(Object object: this.scoreArray) {
			
		}
	}
	
}
