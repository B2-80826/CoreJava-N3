package org.tnsif.instanceofdemo;

public class Child extends Person{
	
	private int Age;

//getter and setter
	
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
//parametersized constructor
	
	public Child(String name,String address,int age) {
		super();
		Age = age;
	}
	
//Default constructor
	
	public Child() {
		super();
		
	}

//tostring 
	
	@Override
	public String toString() {
		return "Child [Age=" + Age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}

	
}
