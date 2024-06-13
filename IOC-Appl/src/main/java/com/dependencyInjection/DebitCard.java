package com.dependencyInjection;

public class DebitCard implements Ipayment {
	
	public DebitCard() {
		System.out.println("Debit Card : Constructor called");
	}

	@Override
	public boolean payBill(double Amount) {
		System.out.println("Debit Card Payment Processing...");
		return true;
	}

}
