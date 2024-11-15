package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
		// TODO Auto-generated method stub
		System.out.println("this is savings accoount.");

	}

	private void fixed() {
		// TODO Auto-generated method stub
		System.out.println("this is fixed account.");
	}
	
	public static void main(String[] args) {
		
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}

}
