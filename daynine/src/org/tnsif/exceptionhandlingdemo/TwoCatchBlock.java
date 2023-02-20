package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

public class TwoCatchBlock {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int arr[]=new int[]{100,20,35};
		System.out.println("Enter the value of x and y");
		int x =sc.nextInt();
		int y =sc.nextInt();
		
try {
			
			System.out.println(arr[3]);
			int z=x/y;
			System.out.println("The the value of z is "+ z);

			
		}
		catch(ArrayIndexOutOfBoundsException |ArithmeticException e ){
			System.out.println("Exception Handeld \n" );
			
		}
	
	}

}









