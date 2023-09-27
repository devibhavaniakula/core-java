package com.tnsif.inheritanceprog;
//super keyword example
class Parent
{
	int var=100;
}
public class SuperDemo extends Parent {
int var=50;
void display()
{
System.out.println("the child value is:"+var);
System.out.println("the parent value is:"+super.var);
}

public static void main(String[] args) {

		// TODO Auto-generated method stub
SuperDemo ob=new SuperDemo();
ob.display();


	}

}
