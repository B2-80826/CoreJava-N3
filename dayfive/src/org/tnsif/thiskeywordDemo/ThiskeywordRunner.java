package org.tnsif.thiskeywordDemo;

 class ThiskeywordRunner {

	
	int a ,b;
	
	 public  ThiskeywordRunner() {
		this.a= 10;
		this.b=20;
		
	}
	ThiskeywordRunner accept() {
		return this;
	}
	void display() {
		
		System.out.println("the value is a is " +a);
		System.out.println("the value is b is " +b);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiskeywordRunner obj =new ThiskeywordRunner();
		obj .accept().display();
	}

}
