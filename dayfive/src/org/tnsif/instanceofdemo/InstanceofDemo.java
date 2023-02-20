package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class InstanceofDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name And Address and age");
		String name=s.nextLine();
		String address=s.nextLine();
				
		int Age=s.nextInt();
		
		Child c=new Child();
		Child c1=new Child(name , address,Age);
		
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(Age);
		
		System.out.println("Here the name address and age" +c1);
		System.out.println(c instanceof Person);
		System.out.println(c1 instanceof Child);
		
	}
	

}
