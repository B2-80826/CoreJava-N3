package org.tnsif.exceptionhandlingdemo;
import java.io.*;
public class ThrowKeyword {

public static void ThrowKeyword(int age, String weight) throws Exception {
	
	if (age>18 && weight>50) 
		System.out.println("Eligible To donate Blood ");
		
	
	else 
		
		throw new IOException("Not Eligible ");
	
}

}
