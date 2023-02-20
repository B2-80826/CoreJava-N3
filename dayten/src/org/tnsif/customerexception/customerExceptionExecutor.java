package org.tnsif.customerexception;

import java.util.Scanner;

public class customerExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Login and Password");
		String id=sc.nextLine();
		String password=sc.nextLine();	
		
	try {
		if(id!="vrushsen@gmail.com"&& password!="vrush") {
			throw new LoginCrediential("Invalid Deta");
		}
		
		else {}
			
	
		
		catch(LoginCrediential e)		{
		System.out.println("");
	}
	
	
	
	}
	}
	
}
