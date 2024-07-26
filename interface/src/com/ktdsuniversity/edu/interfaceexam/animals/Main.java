package com.ktdsuniversity.edu.interfaceexam.animals;

public class Main {

	public static void main(String[] args) {
		
		Dog ppopy = new Dog("뽀삐");
		
		ppopy.walk ();
		ppopy.run();
		ppopy.eat();
		ppopy.bark();
		
		
		Bird 비둘기 =  new Bird("구구");
		
		
		비둘기.walk ();
		비둘기.fly();
		비둘기.run();
		비둘기.eat();
		비둘기.bark();
		
		
		Duck duck = new Duck("덕덕");
		
		duck.fly();
		
		Person kim = new Person("김");
		
		kim.eat();
		kim.speak();
		kim.think();
		kim.walk();;
		kim.work();;
		kim.think();;
		
		
	}
}
