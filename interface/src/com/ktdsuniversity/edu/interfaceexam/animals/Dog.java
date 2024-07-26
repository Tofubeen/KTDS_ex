package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Bark;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class Dog implements Move , Bark , Eat{

	private String name;
	
	
	public Dog(String name) {
		this.name = name;
	}
	
	

	@Override
	public void walk() {
		System.out.println(name + " 이 걷습니다");
		
	}

	@Override
	public void run() {
		System.out.println(name + " 이 뜁니다");
		
	}

	@Override
	public void eat() {
		System.out.println(name + " 이 먹습니다");
		
	}

	@Override
	public void bark() {
		System.out.println(name + " 이 짖습니다");
		
	}

	
}
