package org.tnsif.staicDemo;

public class StaticBlockDemo {

	public static void main(String[] args) {
		System.out.println(StaticBlock.getName());
		
		
		StaticBlock n=new StaticBlock();
		n.setRoll(56);
		System.out.println(n.getRoll() );
		
		
	}

}
