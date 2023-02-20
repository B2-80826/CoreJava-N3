package org.tnsif.multithreading;

public class SyncronizationDemo {

	public static void main(String[] args) {
		SyncronizationTest d=new SyncronizationTest();
		threadone t1=new threadone(d);
		threadTwo t2=new threadTwo(d);
		t1.start();
		t2.start();
	}

}
