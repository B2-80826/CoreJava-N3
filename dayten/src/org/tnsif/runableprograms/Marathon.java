package org.tnsif.runableprograms;

//runnable interfaces program for a thread
public class Marathon implements Runnable {
	//private data members
	private int distance;
	private String city;
	
	
//Runnable interface contain run method 
	@Override
	public void run() {
		
		
	}
	
	
	
	
	//getter n setter
	
	void print() {
		System.out.println("Speed of Particpate "+distance +"the city is"+city);
		
	}

	public int getdistance( ) {
		return distance;
	}

	public void setSpeed(int distance) {
		this.distance = distance;
	}

	public String getCity(String string) {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}




	public void getdistance(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
