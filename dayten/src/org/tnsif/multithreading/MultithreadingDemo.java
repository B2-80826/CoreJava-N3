package org.tnsif.multithreading;
import java.lang.Thread;
public class MultithreadingDemo {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println("Cureent thread \n"+t);
		
		try {
			
			Thread.sleep(5);
		}
		catch(InterruptedException e) {
			
			System.out.println("Main thread Intrupteted");
		}

	}

}
