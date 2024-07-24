package com.ktdsuniversity.edu.array;

import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		
		int[] lottos = new int[6];
		
		int lottoNum = 0;
		Random ran = new Random();
		for(int i =0 ; i <lottos.length ; i++) {
			lottoNum = ran.nextInt(45);
			lottos[i] = lottoNum;
		}//for
		
		System.out.print("중복된 숫자 입니다\t");
		for(int i =0; i<lottos.length ; i++) {
			for(int j = 0 ; j<lottos.length ; j++) {
				if( i != j && j < i && lottos[i] == lottos[j]) {
					System.out.print(lottos[i] + "\t");
				}
			}
		}
		System.out.println();
		System.out.println("로또 번호 추출 결과");
		for(int i =0; i<lottos.length;i++) {
			System.out.println(lottos[i]);
		}
		
		
		
	}
}
