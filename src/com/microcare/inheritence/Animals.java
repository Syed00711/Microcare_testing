package com.microcare.inheritence;

public class Animals {
	
	public Animals() {
		System.out.println("ANimals default constructor");
	}
	
	public Animals(int legs) {
		this.legs=legs;
		System.out.println(" Animals Parametarized constructor");
	}

	int legs;
	String type;
	
	public void setLegs(int legs) {
		this.legs=legs;
		
	}
	
	public void setType(String type) {
		this.type=type;
	
	}
	
	
	public int getLegs() {
		return this.legs;
	}
	
	public String getType() {
		return this.type;
	}
	
	
	
	
}
