package org.tnsif.staicDemo;

public class StaticBlock {

	
	private int roll;
	private static String Name;
	
	static {
		 Name="Vrushsen";
	}

	public static String getName() {
		return Name;
	}

	public static void setName(String name) {
		Name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
}
