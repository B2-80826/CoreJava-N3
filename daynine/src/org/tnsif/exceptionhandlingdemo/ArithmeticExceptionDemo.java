package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the value of x and y");
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		
	try {
		int z=x/y;
		System.out.println("The the value of z is "+ z);
	}
	catch(Exception e) {
		
		System.out.println("Enter valid Input");
		
	}
	
	}

}
