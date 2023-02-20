package org.tnsif.exceptionhandlingdemo;

public class ArrryoutofBoundDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Line");

		System.out.println("First Line");
		
		try {
			int[] myintarray=new int[] {1,2,3};
			print(myintarray);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrays does not found the you enter index");
		}
		
		System.out.println("enter the thid line");
		
		
	}

	public static void print(int[] myintarray) {
		// TODO Auto-generated method stub
		System.out.println(myintarray[3]);
		
	}

}
