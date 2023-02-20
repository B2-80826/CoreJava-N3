package org.tnsif.arraysdemo;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No Index Your want");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
		System.out.println("Enter the element of the arrya");
		for(int i=0;i<n;i++) {
			
			
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	for(int i=0;i<n;i++) {
			
			
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+"\n");
			}
			
			System.out.println("");
		}
		

	};

}
