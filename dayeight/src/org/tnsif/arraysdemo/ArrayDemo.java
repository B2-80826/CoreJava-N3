package org.tnsif.arraysdemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No of Elements ");
		
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
			
		}
		System.out.println("Displing The no of element presnt in Arrays");
		for (int i=0;i<n;i++) {
			
			System.out.println("\n" +arr[i]+"");
			
			
		}
		//Sorting Arrays
		Arrays.sort(arr);
		System.out.println("Sorting Arrays is ");
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]+"");
			
			
		}
		
		
		
	}

}
