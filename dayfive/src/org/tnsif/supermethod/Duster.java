package org.tnsif.supermethod;

public class Duster extends Renault {

	private int Speed=150;
	
	public void print() {
		
		super.print();
		System.out.println("\n speed of Duster is "+ Speed + "KM/Hr");
		
		
	}
	
}
