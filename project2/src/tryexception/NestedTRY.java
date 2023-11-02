package tryexception;

public class NestedTRY {
	public static void check() {
	String str="ha";
	int slength=str.length();
	System.out.println("the length is"+slength);
	String anstring="hello";
	int y=6;
	int arr[]=null;
	try {
		int s=arr[1];
		int z=y/0;
		try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("StringIndexOutOfBounds"+ex.getMessage());
		}
	}
	    catch(NullPointerException e) {
	    	System.out.println("NullpointerException"+e.getMessage());
	    }
		catch(ArithmeticException ex) {
			System.out.println("ArithmeticException"+ex.getMessage());
		}
	}

}
