package com.ktdsuniversity.edu.abstractclass.abstractBar;

public class Drink {

	private String name;
	private String types;
	private int cost;

	public Drink(String name , String types , int cost) {
		this.name = name;
		this.types = types;
		this.cost = cost;
	}

	public String getName() {
		return this.name;
	}
	
	public int getCost() {
		return this.cost;
	}

	public String getTypes() {
		return this.types;
	}
	
	
	
	
}
