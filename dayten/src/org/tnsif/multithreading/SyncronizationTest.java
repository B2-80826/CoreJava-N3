package org.tnsif.multithreading;

public class SyncronizationTest {

	synchronized void print(int num) {
		for(int i=1;i<=5;i++) {
		System.out.println(num*i);
		
		/*try {
			
		}
		catch()	{
	
	
}	*/
		}
		
	}
	
}
//thread one 
class threadone extends Thread{
	SyncronizationTest d;

	public threadone(SyncronizationTest d) {
		super();
		this.d=d;
		

	}
	
	public void run() {
		
		d.print(50);
	}
}	
class threadTwo extends Thread{
	SyncronizationTest b;

	public threadTwo(SyncronizationTest b) {
		super();
		this.b=b;
		

	}
	
	public void run() { 
		
		b.print(50);
	}
	
}
