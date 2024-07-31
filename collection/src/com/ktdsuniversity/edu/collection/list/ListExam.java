package com.ktdsuniversity.edu.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListExam {

	private static void makeLotto() {
		
		List<Integer> lottoList = new ArrayList<Integer>();
		
		Random ran = new Random();
		
		//로또번호는 6개
		//lottoList에 엘리먼트 6개가 다 찰 때까지 반복하자
		//lottoList에 엘리먼트가 언제 6개가 다 차는가 ?===> 중복여부때문에 모른다
		
		while(lottoList.size() <6) {
			//중복되지 않는 숫자만 리스트에 넣어준다
			
			//중복되지 않는지 검사 필요 ---> 리스트에 난수가 포함되어있는가 --> contains --> 이 결과가 true라면 중복된 숫자
			//contains 값이 falseㄹ면 중복되지 않는 숫자 ---> lottolist에 넣는다
			int randomNumber = ran.nextInt(45) +1;
			
			//FIXME 중복검사 해보자 --> 중복됐으면 넣어주지 않는다 --> 중복안됐으면 숫자를 넣는다
			
			if(!lottoList.contains(randomNumber)) {
			lottoList.add(randomNumber);
			}
			
		}
		
		//FIXME 리스트의 항목을 모두 출력해보자 for-each사용
		for(int num : lottoList) {
			System.out.println("로또숫자는 " + num);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(90);
		list.add(80);
		list.add(70);
		
		String str = list.toString();
		System.out.println(list);
		System.out.println(str);
		
		//transitional for
		for(int i = 0; i<list.size(); i++) {
			int eachNumber = list.get(i);
			System.out.println(eachNumber);
		}
		
		//for-each
		for(int eachNumber : list) {
			System.out.println(eachNumber);
		}
		
		//iterator 형식 가능 => 사용 X
		
		//foreach Lamda
		System.out.println("foreach Lamda");
		list.forEach(System.out::println);
		
		
		//삭제
		// 0 1 2 3 인덱스를 가지고 있는 리스트에서 0 인덱스를 제거할 경우
		list.remove(0);
		
		//index 에 할당된 값을 교체
		//현재 0번 인덱스의 값 : 90
		//90을 110 으로 교체
		list.set(0, 110);
		
		System.out.println("0번 인덱스 제거 후 0번 인덱스의 값을 110으로 교체");
		for(int eachNumber : list) {
			System.out.println(eachNumber);
		}
		
		
		//90번이라는 숫자가 list에 있는지 검사
		boolean isExists90 = list.contains(90);
		System.out.println(isExists90);
		
		list.add(90);
		
		isExists90 = list.contains(90);
		
		//리스트 복사
		//list 인스턴스를 list2 인스턴스로 복사 
		
		//1. memory copy - 메모리 주소를 그대로 할당
		List<Integer> list2 = list;
		list.add(-100); // list2 에도 마지막에 -100 추가
		
		System.out.println("메모리 복사 후 출력");
		
		for(int eachNumber : list2) {
			System.out.println(eachNumber);
		}
		
		
		//2.element copy
		list2 = new ArrayList<>();
		list2.addAll(list);
		list.add(-200);
		
		System.out.println("엘리먼트 복사 후 출력");
		
		for(int eachNumber : list2) {
			System.out.println(eachNumber);
			
		}
		
		
		//리스트 엘리먼트 모두 제거
		list.clear();
		list2.clear();
		
		System.out.println("list 인스턴스의 엘리먼트 갯수 " + list.size());
		System.out.println("list2 인스턴스의 엘리먼트 갯수 " + list2.size());
		
		makeLotto();
		
	}
}
