package org.tnsif.thiskeywordDemo;

public class Thiskeywordexecutor {
	
	void function1(Thiskeywordexecutor obj ) {
		System.out.println("Function one Invoked");
	}
	
	void function2() {
		function1(this);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeywordexecutor obj =new Thiskeywordexecutor();
		obj.function2();
	}

}
