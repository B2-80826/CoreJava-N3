package org.tnsif.staicDemo;

public class StaticVariable {
	//non static variable
	private String Name;
	// static variable

	public static String Company="Fynd";

	
	
	@Override
	public String toString() {
		return "StaticVariable [Name=" + Name + "]";
	}
	public StaticVariable(String name) {
		super();
		Name = name;
	}
	

}
