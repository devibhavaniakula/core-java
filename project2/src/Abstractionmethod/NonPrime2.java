package Abstractionmethod;

public class NonPrime2 implements Accounts {
    int amt;

	public NonPrime2() {
		super();
	}

	public NonPrime2(int amt) {
		super();
		this.amt = amt;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public void deliveryCharges(int amt) {
		// TODO Auto-generated method stub
		System.out.println("the amt is:" +amt);
	}
}

	


