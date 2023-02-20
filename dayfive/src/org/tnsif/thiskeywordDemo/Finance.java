package org.tnsif.thiskeywordDemo;

class Finance {
		int salaery;
		
		
	
	
	//final type casting polymorphism
	
	public Finance() {
			System.out.println("Parent class");
		}






	public Finance(int salaery) {
		super();
		this.salaery = salaery;
	}


	void print() {
		System.out.println("salary" +salaery);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finance f=new Finance();
		//f.Finance();
		f.print();
		
		
	}

}
