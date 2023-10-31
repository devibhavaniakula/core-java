package Abstraction;

public abstract class Shape {
	//program to demonstrate abstraction in java
		protected float area;
	//abstract method
		abstract void calArea();
		
		void Show() {
		System.out.println("area of shape:" +area);
		}
	}


