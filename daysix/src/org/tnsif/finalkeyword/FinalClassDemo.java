package org.tnsif.finalkeyword;

public class FinalClassDemo {

	public static void main(String[] args) {
		finalpin pin= new finalpin();
		pin.setPin(1234);
		System.out.println(pin.getPin());
		
		childpin pin2=new childpin() ;
			
		pin2.print();
		
	}

}
