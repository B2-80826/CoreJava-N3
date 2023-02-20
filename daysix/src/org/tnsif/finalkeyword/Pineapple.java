package org.tnsif.finalkeyword;

public class Pineapple extends Cake {
	private String flavour;
	
	
	final void  display1() {
		System.out.println("the flaour of pineaple is"+flavour);
	}
	

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public String toString() {
		return "Pineapple [flavour=" + flavour + ", getClass()=" + getClass() + "]";
	}
	
	
}
