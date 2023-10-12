package com.tnsif.multilevel;

public class SportsCar extends Car {
	private float speed;

	public SportsCar() {
		super();
	}

	public SportsCar(int npassengers) {
		super(npassengers);
		// TODO Auto-generated constructor stub
	}
	public SportsCar(float speed) {
		super();
		this.speed=speed;
	}

	public SportsCar(String name, long plno, float price) {
		super(name, plno, price);
		// TODO Auto-generated constructor stub
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "SportsCar [speed=" + speed + "]";
	}
	

}
