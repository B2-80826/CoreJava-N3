package org.tnsif.runableprograms;

public class SyncronizationBlock {
	
	public void Sendmessage(String message) {
		System.out.println("\n Sending"+message);
	
	try {
		Thread.sleep(2000);
	}

catch(Exception e) {
	System.out.println("thread Interrupt");
}
	
}
}