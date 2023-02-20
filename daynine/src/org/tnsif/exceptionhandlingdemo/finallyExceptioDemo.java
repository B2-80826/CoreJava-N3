package org.tnsif.exceptionhandlingdemo;

// program for finaaly block not excecuted because of  System.exit

public class finallyExceptioDemo {

		public static void main(String[] args) {
		System.out.println("C2Tc");
		int arr[]=new int[]{100,20,35};
		

		try {
			
			System.out.println(arr[3]);
			
		}
		catch(Exception e){
			System.out.println("Exception Handeld \n" +e);
			System.exit(0);
		}
		
finally {
			System.out.println("Finally Block");
		}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
}
