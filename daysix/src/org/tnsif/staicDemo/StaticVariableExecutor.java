package org.tnsif.staicDemo;

public class StaticVariableExecutor {

	public static void main(String[] args) {
		StaticVariable s= new StaticVariable("ok");
		
		System.out.println(s);
		//use classname and after give variable name to print static variable
		System.out.println("Comany Name is "+StaticVariable.Company);
	}

}
