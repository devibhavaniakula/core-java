package com.tnsif.multilevel;
//extends vehicle class
public class Car extends Vehicle {
	private int npassengers;

	public Car() {
		super();
	}

	public Car(int npassengers) {
		super();
		this.npassengers = npassengers;
	}

	public Car(String name, long plno, float price) {
		super(name, plno, price);
		// TODO Auto-generated constructor stub
	}

	public int getNpassengers() {
		return npassengers;
	}

	public void setNpassengers(int npassengers) {
		this.npassengers = npassengers;
	}
	
	

}
