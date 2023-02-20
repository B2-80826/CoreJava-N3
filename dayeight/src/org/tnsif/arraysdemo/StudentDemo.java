package org.tnsif.arraysdemo;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the no element in the array");
		
		
		int n=s.nextInt();
		Student arr[]=new Student[n];
		
		int i=0;
		while(i<n) {
		arr[i]=new Student(s.nextInt(),s.next(),s.nextFloat());
		
		i++;
		}
for (int j=0;j<n;j++) {
	System.out.println(arr[j].getRoll());
	System.out.println("\n"+arr[j].getName());
	System.out.println(arr[j].getPercentage());
	
}
	}

}
