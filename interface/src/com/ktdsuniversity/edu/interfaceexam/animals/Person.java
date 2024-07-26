package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Human;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class Person implements Human{

	private String name;
	
	
	
	
	public Person(String name) {
		this.name = name;
	}
	
	

	@Override
	public void walk() {
		System.out.println(this.name + " 두 발로 걷습니다");
		
	}

	@Override
	public void run() {
		System.out.println(this.name + " 두 발로 뜁니다 속도는 : " + Move.SPEED);
		
	}

	@Override
	public void eat() {
		System.out.println(this.name + " 입으로 먹습니다");
		
	}

	@Override
	public void work() {
		System.out.println(this.name + " 일합니다");
		
	}

	@Override
	public void speak() {
		System.out.println(this.name + " 말합니다");
		
	}

	@Override
	public void think() {
		System.out.println(this.name + " 생각합니다");
		
	}

	
	
}
