package com.ktdsuniversity.edu.interfaceexam.animals;



/**
 * Bird
 * 	-interface : Move , Bark , Eat , Fly
 * 	-Bird is a Move
 */
public class Chiken extends Bird{

	
	
	
	
	public Chiken(String name) {
		super(name);
	}
	
	
	
	

	@Override
	public void fly() {
		System.out.println(this.name + " 이 3초간 퍼덕입니다");
		
	}

	@Override
	public void eat() {
		System.out.println(this.name + " 이 먹습니다");
		
	}

	@Override
	public void bark() {
		System.out.println(this.name + " 이 지저귐니다");
		
	}

	@Override
	public void walk() {
		System.out.println(this.name + " 이 걷습니다");
		
	}

	@Override
	public void run() {
		System.out.println(this.name + " 이 뒵니다");
		
	}

}
