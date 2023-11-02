package exceptionthrow;

import java.util.Scanner;

public class DemoExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a roll number");
    int r=sc.nextInt();
    if(r<=0) {
    	throw new ArithmeticException("roll number cannot be zero");
    }
    else {
    	System.out.println("valid number");
    }
    
	}

}
