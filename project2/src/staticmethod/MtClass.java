package staticmethod;

public class MtClass {

	
	   private int section;
	   private static int srNo;
	   static {
		   System.out.println("static block");
		   srNo=1000;
	   }
	   MtClass(){
		   System.out.println("default controctor");
		   srNo++;
		   section++;
	   }
	@Override
	public String toString() {
		return "MtClass [section=" + section + "]";
	}
	   static void display() {
		   System.out.println("serialno"+srNo);
	   }
	}
