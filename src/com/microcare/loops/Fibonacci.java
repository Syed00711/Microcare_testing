package com.microcare.loops;

public class Fibonacci {
/*
 * n=10
int a=0;
int b=1;
int c;

0 1 1 2 3 5 8 11 19 30......

for loop
 */
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int n=0;n<10;n++) {
			c=a+b;
			
			
			System.out.println(c);
		}

	}

}
