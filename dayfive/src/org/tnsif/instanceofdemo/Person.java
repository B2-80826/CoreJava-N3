package org.tnsif.instanceofdemo;

public class Person {
	//data members
	private String name;
	private String address;
	
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Default constructor
	public Person() {
		System.out.println("Parent class");
		
	}
	
	//paramerized constructor
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
