package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class NewTryDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the value of x and y");
		
		int x =sc.nextInt();
		
		
		int y =sc.nextInt();
		int arr[]=new int[]{100,20,35};
		
		try {
			
			
			try {
				System.out.println("Print the Array"+arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e ) {
				
				System.out.println("Exception Handeld by inner catch box" +e);
			
			}
			try {
				int z=x/y;
				System.out.println(z);
			}
			
			catch(ArithmeticException e) {
				
				System.out.println("Exception Handeld by outer catch box" +e);
			}
		}
		
		
		finally {
			System.out.println("Finalbox");
		}
		
	}

}
