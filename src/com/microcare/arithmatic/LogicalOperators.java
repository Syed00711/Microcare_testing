package com.microcare.arithmatic;

public class LogicalOperators {

		  public static void main(String[] args) {

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
