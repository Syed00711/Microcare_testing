package com.microcare.arithmatic;

/**
 * @author sh030348
 * This is demo class for arithmatic operations
 */
public class Calculations {
	// -2^32-1  -- 2^32   00000000000000000000   12481632 
	/// -2^15  2^16
    
	
	public static void main(String[] args) {
		//local variables
		int a=1;
	   short b=2;
	   long c=3;
	   float d=4;
	     double e=669 ;
	    boolean check;
// arithmatic operaters + - % 
//	conditional operators > < 	? >> << ==
		a=b;
 		double val = (a==b)?c:d;
      //(expresssion?true:false)
      System.out.println("main method variable:"+a);
      //System.out.println(check);
     // System.out.println(b);
     // System.out.println(d);
      //System.out.println(e);
      localVariables();
	}
	//global variable
	static int a=7;
	public static void localVariables() {
		
		System.out.println("global variable"+a);
	}
	
	///this is a inner class
	class Subclass {
		
		
	}

}
