package com.microcare.arithmatic;

public class LogicalOperators {

		  public static void main(String[] args) {
			  
			  //AND OR NOT
			 // 1 AND 0 == 0
			  //1 OR 0==1
			  //1 AND 1 ==1
			  // 0 OR 0==0

		    // && operator
		    System.out.println((5 > 3) && (8 > 5));  // true
		    System.out.println((5 > 3) && (8 < 5));  // false

		    // || operator
		    System.out.println((5 < 3) || (8 > 5));  // true
		    System.out.println((5 > 3) || (8 < 5));  // true
		    System.out.println((5 < 3) || (8 < 5));  // false

		    // ! operator
		    System.out.println(!(5 == 3));  // true
		    System.out.println(!(5 > 3));  // false
		  }
		

}
