package com.microcare.dayone;



public class Scope {
	
	public  int checkScope() {
		int b=_HelloWorld.a=5;
		
		
		com.microcare.daytwo.AccessModifier microcareTwo =new com.microcare.daytwo.AccessModifier();
		com.microcare.dayone.AccessModifier microcareOne =new com.microcare.dayone.AccessModifier();

		return microcareOne.accessNumber();
	}
}
