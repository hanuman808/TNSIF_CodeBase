package com.tnsif;

public class demo1 {

	public static void main(String[] args) {
		System.out.println("hello");
		int value ='A';
		System.out.println(value);
		double value2= 101d/61d;
		System.out.println(value2);
		char ch =65;
		System.out.println(ch);
		int name = 'A';
		byte max = 127;
		byte min = -128;

		System.out.println(max);
		
		
//		//Type Casting 
//		
//		//Widening ||Implicit
		
		byte a = 10;
		int b =a;
		System.out.println(b);
		
		
		//Narrowing || Explicit 
		short c = 130;
		byte d = (byte)(c);
		
		System.out.println(d);


	}

}
