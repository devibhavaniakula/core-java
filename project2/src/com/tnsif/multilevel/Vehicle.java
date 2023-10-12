package com.tnsif.multilevel;

public class Vehicle {
	private String name;
	private long plno;
	private float price;
	public Vehicle() {
		super();
	}
	public Vehicle(String name, long plno, float price) {
		super();
		this.name = name;
		this.plno = plno;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPlno() {
		return plno;
	}
	public void setPlno(long plno) {
		this.plno = plno;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", plno=" + plno + ", price=" + price + "]";
	}
	
	
	

}
