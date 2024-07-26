package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class AnonymousClassExam {

	public static void main(String[] args) {
		
		Eat eat = new Bird("");
		
		Eat anonyEat = new Eat() {
			
		@Override
		public void eat() {
				System.out.println("냠냠");
				
			}
		};
		
		
		anonyEat.eat();
		
		Fly anonyFly = new Fly() {
			@Override
			public void fly() {
			
				Fly.super.fly();
			}
		};
		
		anonyFly.fly();
		
		
		String anonyName = "익명";
		Move anonyMove = new Move() {
			private String name = anonyName;
			
			
			@Override
			public void walk() {
				System.out.println("걷습니다");
				
			}
			
			@Override
			public void run() {
				System.out.println("뜁니다");
				
			}
		};
		anonyMove.run();
		anonyMove.walk();
		
		
		
	}
}
