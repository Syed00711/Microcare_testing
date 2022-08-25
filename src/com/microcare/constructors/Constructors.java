package com.microcare.constructors;

public class Constructors {
    static int c;
   int d;
  
  static {
	  c=7;
	  System.out.println("This is a static block");
  }
	
	public  Constructors(){
		System.out.println("This is a constructor");
	}
	public Constructors(int a){
		c=a;
		System.out.println("This is a constructor:"+c);
	}
	public Constructors(int a,int b){
		System.out.println("This is a constructor:"+a+b);
	}
	
	public Constructors(String a){
		System.out.println("This is a constructor:"+a);
	}
	
	//
	
	
	
	
}
