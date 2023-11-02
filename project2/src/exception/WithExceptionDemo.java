package exception;



public class WithExceptionDemo {
	
	  public static void divide() {
		  
		  try {
	  }
		  catch(ArithmeticException e) {
			System.out.println("Exception Caught"+e.getMessage());  
	}
		  catch(Exception e) {
				System.out.println("Exception Caught"+e.getMessage());  
		}
		  finally {
			  System.out.println("it will be executed");
		  }
	}
	}