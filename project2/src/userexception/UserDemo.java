package userexception;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	        try {
	        	UserClass.validate();
	        }
	        catch (Age e) {
	        	System.out.println("caught exception"+e.getMessage());
	        }
	        
		}

	}
