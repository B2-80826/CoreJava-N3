package org.tnsif.runableprograms;

public class technical extends Thread{

	@Override
	public void run() {
		
	System.out.println("Java Full Stack Training");
	
	for(int i=1;i<=5;i++) {
		
		System.out.println(i+"");
	}
	
	
	
	try{
		Thread.sleep(2000);
	}
	
	catch( InterruptedException e) {
		System.out.println(e);
		
	}
	
	System.out.println("yes we did it");
	}

}
