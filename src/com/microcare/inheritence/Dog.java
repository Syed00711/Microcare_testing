package com.microcare.inheritence;

public class Dog extends Animals{
	
	public Dog(){
		super.type="dfs";		
	}
	public Dog(int legs) {
		super(legs);
	}

	String color;
	String Breed;
	int legs;
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}

	public void setParentLegs(int legs) {
		this.legs=legs;
		super.legs=legs+1;
	
	}

}
