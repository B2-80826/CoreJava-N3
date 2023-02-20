package org.tnsif.staicDemo;

public class StaticMethod {

	
	private static double salalry=50000;
	//mnon static method
	/*public void display() {
		
		System.out.println("Salary is" +salalry);
	}
	
	//getter nad setter 
	public double getSalalry() {
		return salalry;
	}
	public void setSalalry(double salalry) {
		this.salalry = salalry;
	}

	*/
public static void display() {
		
		System.out.println("Salary is" +salalry);
	}
public double getSalalry() {
	return salalry;
}
public void setSalalry(double salalry) {
	this.salalry = salalry;
}
	
}
