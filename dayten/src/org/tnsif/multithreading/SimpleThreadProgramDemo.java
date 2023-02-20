package org.tnsif.multithreading;
import java.lang.Thread;
public class SimpleThreadProgramDemo {

	public static void main(String[] args) {
		SimpleThreadProgram p =new SimpleThreadProgram ();
		p.setName("Java Thread");
		p.setPriority(5);
		p.start();
		p.run();
		System.out.println("Cureent thraed\n "+p);
	}

}
